package com.heinsohn.DTO;

import org.springframework.data.repository.CrudRepository;

import com.heinsohn.model.Usuario;

public interface UsuarioDTO extends CrudRepository<Usuario, Integer> {

}
