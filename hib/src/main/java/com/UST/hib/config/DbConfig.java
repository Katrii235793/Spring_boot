package com.UST.hib.config;//database configuration

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@PropertySource(value= {"classpath:application.properties"})
@Configuration
public class DbConfig {
	
	@Value("${jdbc.driverClassName}")	
	private String driverClass;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	@Value("${hibernate.dialect}")
	private String dialect;
	
	
	@Bean
    public DataSource getDataSource() {
		
	DriverManagerDataSource datasource=new DriverManagerDataSource(url,username,password);
	datasource.setDriverClassName(driverClass);
		
		return datasource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
	
		LocalSessionFactoryBean factory=new LocalSessionFactoryBean();
		factory.setDataSource(getDataSource());
		factory.setHibernateProperties(hibernateProperties());
		factory.setPackagesToScan(new String[] {"com.ust.hib.entity"});
		
		
		return factory;
		
		
		
	}

	private Properties hibernateProperties() {
		Properties properties=new Properties();
		properties.put("hibernate.dialect", "dialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.show.sql", true);
		properties.put("hibernate.formate_sql", true);
		return properties;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionmanager(SessionFactory factory) {
		
		 HibernateTransactionManager  transactionmanager=new  HibernateTransactionManager();
		 transactionmanager.setSessionFactory(factory);
		 return transactionmanager;
		
	}
}
