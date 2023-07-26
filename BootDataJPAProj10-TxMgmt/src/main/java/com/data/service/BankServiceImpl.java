package com.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.data.repository.IAccountRepository;

@Service("bankService")
public class BankServiceImpl implements IBankService {
	
	@Autowired
	private IAccountRepository accountRepo;

	@Override
	@Transactional
	public String transferMoney(int srcAcNo, int destAcNo, double amount) {
		
		int result1 = accountRepo.withdrawMoney(srcAcNo, amount);
		int result2 = accountRepo.depositMoney(destAcNo, amount);
		
		if(result1 == 0 || result2 == 0) {
			throw new RuntimeException("Problem in Transfer Money");
		}
		
		return "Money Transfer from "+srcAcNo+" to "+destAcNo+" amount "+amount;
	}

}
