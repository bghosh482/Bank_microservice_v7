package com.eazybytes.accounts.service;


import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     * Creates a new account for the given customer.
     *
     * @param customerDto The data transfer object containing customer details
     */
    void createAccount(CustomerDto customerDto);
    /**
     * Fetches the account details for the given mobile number.
     *
     * @param mobileNumber The mobile number to fetch the account for
     * @return The customer details if the customer exists, or an empty object if the customer does not exist.
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * Updates the account details for the given customer.
     *
     * @param customerDto The data transfer object containing customer details
     * @return True if the customer is updated successfully, false if the customer does not exist.
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * Deletes the account associated with the given mobile number.
     *
     * @param mobileNumber The mobile number of the account to be deleted
     * @return True if the account is deleted successfully, false if the account does not exist.
     */
    boolean deleteAccount(String mobileNumber);

}
