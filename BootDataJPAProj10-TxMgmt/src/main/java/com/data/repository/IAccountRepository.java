package com.data.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import com.data.entity.Account;

public interface IAccountRepository extends JpaRepository<Account, Integer> {
	
	
	@Query("update Account set amount=amount-:amt where acno=:srcAcno")
	@Modifying
	public int withdrawMoney(int srcAcno, double amt);
	
	@Query("update Account set amount=amount+:amt where acno=:destAcno")
	@Modifying
	public int depositMoney(int destAcno, double amt);
	
	

	

}
