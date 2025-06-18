package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.CustomerDetailsDto;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Customer;

public class CustomerMapper {

    /**
     * Maps the properties of a Customer entity to a CustomerDto.
     *
     * @param customer The source Customer entity containing customer details.
     * @param customerDto The target CustomerDto to populate with data from the customer entity.
     * @return The populated CustomerDto with data from the Customer entity.
     */
    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static CustomerDetailsDto mapToCustomerDetailsDto(Customer customer, CustomerDetailsDto customerDetailsDto) {
        customerDetailsDto.setName(customer.getName());
        customerDetailsDto.setEmail(customer.getEmail());
        customerDetailsDto.setMobileNumber(customer.getMobileNumber());
        return customerDetailsDto;
    }



    /**
     * Maps the properties of a CustomerDto to a Customer entity.
     *
     * @param customerDto The source CustomerDto containing customer details.
     * @param customer The target Customer entity to populate with data from the customerDto.
     * @return The populated Customer entity with data from the CustomerDto.
     */
    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }

}
