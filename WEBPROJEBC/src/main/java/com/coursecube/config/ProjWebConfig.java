package com.coursecube.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages= {
		"com.coursecube.controller",
		"com.coursecube.DAO",
		"com.coursecube.DAOImpl",
		"com.coursecube.Service",
		"com.coursecube.serviceimpl",
		"com.coursecube.controller" }
		)
public class ProjWebConfig {
	
	@Bean
	public DataSource getDS(){
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:NCDBRIX");
		ds.setUsername("sys as sysdba");
		ds.setPassword("Apara1234");
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionfactory(DataSource ds){
		LocalSessionFactoryBean factoryBean=new LocalSessionFactoryBean();
		factoryBean.setDataSource(ds);
		
		Properties props=new Properties();
		props.put("dialect", "org.hibernate.dialect.OracleDialect");
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.hbm2ddl.auto", "update");
		
		factoryBean.setHibernateProperties(props);
		factoryBean.setPackagesToScan("com.coursecube.DAOImpl");
		return factoryBean;
	}
	
	@Bean 
	public HibernateTemplate getHT(SessionFactory sessionFactory){
		return new HibernateTemplate(sessionFactory);
	}
	
	@Bean
	public HibernateTransactionManager getHTM(SessionFactory sessionFactory){
		return new HibernateTransactionManager(sessionFactory);
	}
	
	
	
	
}
