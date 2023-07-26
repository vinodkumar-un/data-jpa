package com.data.runners;

import java.sql.CallableStatement;
import java.sql.ResultSet;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import oracle.jdbc.OracleTypes;

@Component
public class CallingPL_SQLFunctionTestRunner implements CommandLineRunner {

	@Autowired
	private EntityManager manager;

	@Override
	public void run(String... args) throws Exception {

		Session session = manager.unwrap(Session.class);
		session.doWork(conn -> {
			CallableStatement cs = conn.prepareCall("{?=call FX_GET_ACTORS_DATA_BY_PHONES(?, ?)}");
			cs.registerOutParameter(1, OracleTypes.CURSOR);

			cs.setLong(2, 123000);
			cs.setLong(3, 876000);

			cs.execute();

			ResultSet rs = (ResultSet) cs.getObject(1);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
		});
	}

}
