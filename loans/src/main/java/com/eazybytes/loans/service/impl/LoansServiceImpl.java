package com.eazybytes.loans.service.impl;

import com.eazybytes.loans.constants.LoansConstants;
import com.eazybytes.loans.dto.LoansDto;
import com.eazybytes.loans.entity.Loans;
import com.eazybytes.loans.exception.LoansAlreadyExistsException;
import com.eazybytes.loans.exception.ResourceNotFoundException;
import com.eazybytes.loans.mapper.LoansMapper;
import com.eazybytes.loans.repository.LoansRepository;
import com.eazybytes.loans.service.ILoansService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class LoansServiceImpl implements ILoansService {

    private LoansRepository loansRepository;

    /**
     * Creates a new loan for the given mobile number.
     *
     * @param mobileNumber The mobile number associated with the loan.
     * @throws LoansAlreadyExistsException if a loan already exists for the given mobile number.
     */
    @Override
    public void createLoan(String mobileNumber) {
        Optional<Loans> loans = loansRepository.findByMobileNumber(mobileNumber);
        if(loans.isPresent()){
            throw new LoansAlreadyExistsException("Loan already exists for this mobile number : " + mobileNumber);
        }
        loansRepository.save(createNewLoans(mobileNumber));

    }

    /**
     * Fetches the loan details for the given mobile number.
     *
     * @param mobileNumber The mobile number associated with the loan.
     * @return A LoansDto containing the loan details.
     */
    @Override
    public LoansDto fetchLoan(String mobileNumber) {

        Loans loans = loansRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Loan", "mobileNumber", mobileNumber)
        );
       return LoansMapper.mapToLoansDto(loans, new LoansDto());
    }

    /**
     * Deletes the loan details associated with the given mobile number.
     *
     * @param mobileNumber The mobile number associated with the loan.
     * @return true if the loan is successfully deleted, false otherwise.
     * @throws ResourceNotFoundException if no loan is associated with the given mobile number.
     */
    @Override
    public boolean deleteLoan(String mobileNumber) {

        Loans loans = loansRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Loan", "mobileNumber", mobileNumber)
        );
        loansRepository.deleteById(loans.getLoanId());
        return true;
    }


    @Override
    public boolean updateLoan(LoansDto loansDto) {
        Loans loans = loansRepository.findByLoanNumber(loansDto.getLoanNumber()).orElseThrow(
                () -> new ResourceNotFoundException("Loan", "LoanNumber", loansDto.getLoanNumber()));
        LoansMapper.mapToLoans(loansDto, loans);
        loansRepository.save(loans);

        return  true;
    }

    /**
     * Creates a new Loans object with random loan number, given mobile number, {@link LoansConstants#HOME_LOAN} as loan type,
     * {@link LoansConstants#NEW_LOAN_LIMIT} as total loan, 0 as amount paid and {@link LoansConstants#NEW_LOAN_LIMIT} as outstanding amount.
     * @param mobileNumber The mobile number associated with the loan.
     * @return The newly created Loans object.
     */
    private Loans createNewLoans(String mobileNumber) {
        Loans loans = new Loans();
        long randomLoanNuber = 100000000000L + new Random().nextInt(900000000);
        loans.setLoanNumber(Long.toString(randomLoanNuber));
        loans.setMobileNumber(mobileNumber);
        loans.setLoanType(LoansConstants.HOME_LOAN);
        loans.setTotalLoan(LoansConstants.NEW_LOAN_LIMIT);
        loans.setAmountPaid(0);
        loans.setOutstandingAmount(LoansConstants.NEW_LOAN_LIMIT);
        return loans;
    }
}
