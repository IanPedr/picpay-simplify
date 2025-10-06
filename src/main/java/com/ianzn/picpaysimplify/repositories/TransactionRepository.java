package com.ianzn.picpaysimplify.repositories;

import com.ianzn.picpaysimplify.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
