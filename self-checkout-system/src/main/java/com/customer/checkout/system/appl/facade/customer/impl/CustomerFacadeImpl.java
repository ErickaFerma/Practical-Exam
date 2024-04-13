package com.customer.checkout.system.appl.facade.customer.impl;

import com.customer.checkout.system.appl.facade.customer.CustomerFacade;
import com.customer.checkout.system.appl.model.customer.Customer;
public class CustomerFacadeImpl implements CustomerFacade {
    private CustomerFacade CustomerFacade;

    public CustomerFacadeImpl(CustomerFacade employeeDao) {
        CustomerFacade = null;
    }

    public CustomerFacadeImpl() {
        CustomerFacade = null;
        this.CustomerFacade = new CustomerFacade() {
            @Override
            public Customer savecustomer(Customer customer) {
                return null;
            }

            @Override
            public Customer saveCustomer(Customer customer) {
                return null;
            }

            @Override
            public Customer findCustomerById(String customerId) {
                return null;
            }
        };
    }

    @Override
    public Customer savecustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return CustomerFacade.savecustomer(customer);
    }

    @Override
    public Customer findCustomerById(String customerId) {
        return CustomerFacade.findCustomerById(customerId);
    }

    private abstract class CustomerDaoImpl implements CustomerFacade {
    }
}
