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

		 

	        URI dbUri;
	        
	        try {
	            dbUri = new URI(System.getenv("DATABASE_URL"));
	            String username = dbUri.getUserInfo().split(":")[0];
	            String password = dbUri.getUserInfo().split(":")[1];
	            String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath() + "?sslmode=require";
	            
	            ds.setDriverClassName( "org.postgresql.Driver" );
	            ds.setUrl( dbUrl );
	            ds.setUsername( username );
	            ds.setPassword( password );
	        } 
	        catch (URISyntaxException e) {
	            e.printStackTrace();
	            
	            throw new RuntimeException( "no s epuede conectar a la base de datos" );
	        }

	 


//	        ds.setDriverClassName( "org.postgresql.Driver" );
//	        ds.setUrl( "jdbc:postgresql://127.0.0.1:5432/distribuida" );
//	        ds.setUsername( "postgres" );
//	        ds.setPassword( "postgres" );
	        
	        return ds;
	    }

	}
