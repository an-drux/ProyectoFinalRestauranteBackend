package com.heinsohn.DTO;

import org.springframework.data.repository.CrudRepository;

import com.heinsohn.model.Ingredientes;

public interface IngredientesDTO extends CrudRepository<Ingredientes, Integer> {

}
