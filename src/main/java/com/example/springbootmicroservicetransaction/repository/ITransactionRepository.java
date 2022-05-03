package com.example.springbootmicroservicetransaction.repository;

import com.example.springbootmicroservicetransaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//JPARepository: first parameter: modal class name
//second parameter: class of primary key type
public interface ITransactionRepository extends JpaRepository<Transaction,Long> {

List<Transaction> findAllByUserId(Long userId);
}
