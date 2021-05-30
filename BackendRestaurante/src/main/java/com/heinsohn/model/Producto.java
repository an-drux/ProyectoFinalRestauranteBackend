package com.heinsohn.model;

import javax.persistence.*;

@Entity
public class Producto {
	@Id
	private int id;
	
	@Column
	private String Nombre;
	
	@Column
	private String Ingredientes;
	
	@Column 
	private int Precio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getIngredientes() {
		return Ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		Ingredientes = ingredientes;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	
}
