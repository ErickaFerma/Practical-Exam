package com.customer.checkout.system.appl.facade.transaction.impl;

import com.customer.checkout.system.appl.facade.transaction.TransactionFacade;
import com.customer.checkout.system.appl.model.transaction.Transaction;
import com.customer.checkout.system.data.transaction.dao.impl.TransactionDaoImpl;

/**
 * This is the Transaction Facade Impl.
 * */
public class TransactionFacadeImpl implements TransactionFacade {
    private final TransactionFacade TransactionDao;

    public TransactionFacadeImpl(TransactionFacade studentDao) {
        this.TransactionDao = studentDao;
    }

    public TransactionFacadeImpl() {
        this.TransactionDao = (TransactionFacade) new TransactionDaoImpl();
    }

    @Override
    public Transaction findTransactionById(String item_Id) {
        return TransactionDao.findTransactionById(item_Id);
    }

    @Override
    public boolean saveTransaction(Transaction transaction) {
        return TransactionDao.saveTransaction(transaction);
    }
}