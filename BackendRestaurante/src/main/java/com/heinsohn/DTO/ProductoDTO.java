package com.heinsohn.DTO;

import org.springframework.data.repository.CrudRepository;

import com.heinsohn.model.Producto;

public interface ProductoDTO extends CrudRepository<Producto, Integer>{ //permite usar el crud de spring
}
