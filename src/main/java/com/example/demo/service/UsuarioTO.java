package com.example.demo.service;

import java.io.Serializable;

public class UsuarioTO implements Serializable{
	
	
	private static final long serialVersionUID = -7694699189789544899L;
	private String nombre;
	private String password;
	
	
	
	
	
	@Override
	public String toString() {
		return "UsuarioTO [nombre=" + nombre + ", password=" + password + "]";
	}
	//SET Y GET 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}