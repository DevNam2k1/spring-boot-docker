package com.project.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.repository.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long>{

}
