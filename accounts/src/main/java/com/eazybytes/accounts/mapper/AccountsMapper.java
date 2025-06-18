package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.entity.Accounts;

public class AccountsMapper {

    /**
     * Maps the properties of an Accounts entity to an AccountsDto.
     *
     * @param accounts The source Accounts entity containing account details.
     * @param accountsDto The target AccountsDto to populate with data from the accounts entity.
     * @return The populated AccountsDto with data from the Accounts entity.
     */
    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    /**
     * Maps the properties of an AccountsDto to an Accounts entity.
     *
     * @param accountsDto The source AccountsDto containing account details.
     * @param accounts The target Accounts entity to populate with data from the accountsDto.
     * @return The populated Accounts entity with data from the AccountsDto.
     */
    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }


}
