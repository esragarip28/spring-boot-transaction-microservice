package com.example.springbootmicroservicetransaction.service;

import com.example.springbootmicroservicetransaction.model.Transaction;

import java.util.List;

public interface ITransactionService {

    public Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransactionOfUser(Long userId);
}
