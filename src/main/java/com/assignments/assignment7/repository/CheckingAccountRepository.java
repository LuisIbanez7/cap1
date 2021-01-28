package com.assignments.assignment7.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignments.assignment7.models.CheckingAccount;


//public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, Integer>{
//
//
//}

@Transactional
public interface CheckingAccountRepository extends BankAccountRepository<CheckingAccount>{
	
}
