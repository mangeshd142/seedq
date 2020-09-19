package com.seedq.sql.connection;

import java.io.InputStream;
import java.util.Properties;
import org.springframework.stereotype.Component;
import com.seedq.restinterface.bean.SQLPropertiesInterface;

@Component
public class SQLProperties implements SQLPropertiesInterface{

	private Properties properties;
	
	public SQLProperties() {
		InputStream inputStream = null;
		try {
			inputStream = SQLProperties.class.getResourceAsStream("database.properties");
			this.properties = new Properties();
			this.properties.load(inputStream);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(inputStream!= null) {
					inputStream.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public String getProperty(String key) {
		return this.properties.getProperty(key);
	}
	
}
