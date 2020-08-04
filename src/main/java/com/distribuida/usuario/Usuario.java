package com.distribuida.usuario;
//Aqui creamos nuestro objeto Usuario con los atributos de persona
public class Usuario {
	private int id;
	private String nombre;
	private String direccion;
	private String email;
	
	public Usuario() {		
	}
	
	
	//Genermos un constructor sin el atributo id
	public Usuario(String nombre, String direccion, String email) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
	}



	//Genermos un segundo constructor con todos los atributos
	public Usuario(int id, String nombre, String direccion, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
