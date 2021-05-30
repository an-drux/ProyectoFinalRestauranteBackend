package com.heinsohn.model;

import javax.persistence.*;

@Entity
public class Usuario {

	@Id
	private int Id;
	
	@Column
	private String Nombre;
	
	@Column
	private String Username;
	
	@Column
	private String Password;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	//@Column
	//private Enum Rol;
	
}
