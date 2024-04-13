package com.customer.checkout.system.appl.facade.transaction;

import com.customer.checkout.system.appl.model.transaction.Transaction;

public interface TransactionFacade {
    Transaction findTransactionById(String itemId);

    boolean saveTransaction(Transaction transaction);
}
