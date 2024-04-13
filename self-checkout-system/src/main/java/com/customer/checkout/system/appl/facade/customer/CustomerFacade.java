package com.customer.checkout.system.appl.facade.customer;

import com.customer.checkout.system.appl.model.customer.Customer;

public interface CustomerFacade {
    Customer savecustomer(Customer customer);

    Customer saveCustomer(Customer customer);

    Customer findCustomerById(String customerId);
}
