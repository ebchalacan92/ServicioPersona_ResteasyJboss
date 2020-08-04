package com.distribuida.db;

import java.net.URI;
import java.net.URISyntaxException;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

@ApplicationScoped
public class ManejadorDb {
	
	//Método productor: es un método que ya está creado, no por nosotros por eso no se puede poner anotaciones.
	
	//Este es un bean productor : Lo que nos retorna este método es una componente de negocio gestionado por CDI;
	//es un metodo de tipo datasource el cual se inyectará cuando 
	//lo necesitemos.
	@Produces @ApplicationScoped
	public DataSource db() {
		
		BasicDataSource ds = new BasicDataSource();
		
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://ec2-52-202-66-191.compute-1.amazonaws.com:5432/d601dqtlqgse7j");
		ds.setUsername("svprltmotmesyq");
		ds.setPassword("e69d5bdc20722f8258dbf0edfd028b4f3adaf6eca32d7349357c1be935563fa4");
		
		
		return ds ;
	}

}
