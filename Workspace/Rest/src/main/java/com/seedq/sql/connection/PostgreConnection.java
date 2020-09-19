package com.seedq.sql.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.seedq.restinterface.bean.SQLPropertiesInterface;

public abstract class PostgreConnection {
	
	@Autowired
	private SQLPropertiesInterface sqlProperties;
	private Connection connection = null;
	
	/**
	 * creating Postgre SQL connection
	 * @return connection
	 */
	public Connection getConnection() {
		
		try {
			if(connection == null) {
		         Class.forName(sqlProperties.getProperty("sqlDriver"));
		         connection = DriverManager
		            .getConnection(sqlProperties.getProperty("connectionURL"),
		            		sqlProperties.getProperty("dbUser"),sqlProperties.getProperty("password"));
			}
		}
		catch (Exception e) {
			try {
				if(connection != null) {
					connection.close();
				}
			} catch (Exception exp) {
				exp.printStackTrace();
			}
		} 
		
		return connection;
	}
	
	public void conn() {
		
	}
	
	
}
