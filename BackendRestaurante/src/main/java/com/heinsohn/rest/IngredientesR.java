package com.heinsohn.rest;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.heinsohn.DTO.IngredientesDTO;
import com.heinsohn.model.Ingredientes;

@RestController
@RequestMapping("ingredientes")
public class IngredientesR {
	@Autowired
	private IngredientesDTO dto;

	@GetMapping
	public List<Ingredientes> getAll() {
		return (List<Ingredientes>) dto.findAll();
	}

	@PostMapping
	public Ingredientes guardarDato(@RequestBody Ingredientes ingrediente) {
		return dto.save(ingrediente);
	}
	
	@PutMapping
	public Ingredientes actualizarDato(@RequestBody Ingredientes ingrediente) {
		try {
			dto.findById(ingrediente.getId()).get();
			return dto.save(ingrediente);
		}catch (NoSuchElementException e) {
			return null;
		}
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") Integer Id) {
		dto.deleteById(Id);
	}

}