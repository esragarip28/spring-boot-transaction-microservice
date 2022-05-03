package com.example.springbootmicroservicetransaction.service;

import com.example.springbootmicroservicetransaction.model.Transaction;
import com.example.springbootmicroservicetransaction.repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements ITransactionService{

    @Autowired
    private ITransactionRepository transactionRepository;


    @Override
    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long transactionId){
        transactionRepository.deleteById(transactionId);
    }

    @Override
    public List<Transaction> findAllTransactionOfUser(Long userId){
        return  transactionRepository.findAllByUserId(userId);
    }


}
