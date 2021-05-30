package com.heinsohn.rest;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heinsohn.DTO.ProductoDTO;
import com.heinsohn.model.Producto;

@RestController
@RequestMapping("producto")
public class ProductoR {
	@Autowired
	private ProductoDTO dto;

	@GetMapping
	public List<Producto> getAll() {
		return (List<Producto>) dto.findAll();
	}

	@PostMapping
	public Producto guardarDato(@RequestBody Producto producto) {
		return dto.save(producto);
	}

	@PutMapping
	public Producto actualizarDato(@RequestBody Producto producto) {
		try {
			dto.findById(producto.getId()).get();
			return dto.save(producto);
		} catch (NoSuchElementException e) {
			return null;
		}
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") Integer Id) {
		dto.deleteById(Id);
	}
}
