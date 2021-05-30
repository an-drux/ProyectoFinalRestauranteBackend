package com.heinsohn.model;

import javax.persistence.*;

@Entity
public class Ingredientes {

	@Id
	private int Id;
	
	@Column
	private String Nombre;
	
	@Column 
	private int Cantidad;
	
	@Column
	private int Precio;

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

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}
}

	
