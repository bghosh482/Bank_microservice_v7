package com.eazybytes.loans.service;

import com.eazybytes.loans.dto.LoansDto;


public interface ILoansService {
    /**
     * Creates a new loan for the given mobile number.
     *
     * @param mobileNumber The mobile number associated with the loan.
     * @throws LoansAlreadyExistsException if a loan already exists for the given mobile number.
     */
    public void createLoan(String mobileNumber);

    /**
     * Fetches the loan details for the given mobile number.
     *
     * @param mobileNumber The mobile number associated with the loan.
     * @return A LoansDto containing the loan details.
     */
    public LoansDto fetchLoan(String mobileNumber);

    public boolean deleteLoan(String mobileNumber);
    public boolean updateLoan(LoansDto loansDto);

}
