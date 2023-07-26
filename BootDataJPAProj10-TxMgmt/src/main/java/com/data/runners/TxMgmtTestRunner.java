package com.data.runners;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.data.service.IBankService;


@Component
public class TxMgmtTestRunner implements CommandLineRunner {

	@Autowired
	private IBankService service;

	@Override
	public void run(String... args) throws Exception {
	
		try {
			String result = service.transferMoney(101, 202, 8000.0);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
