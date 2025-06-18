package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;


public interface ICustomerService {

    /**
     * Fetches the customer details for the given mobile number.
     *
     * @param mobileNumber The mobile number to fetch the customer details for
     * @return The customer details as a CustomerDto
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber,String correlationId);
}
