package com.heinsohn.rest;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heinsohn.DTO.UsuarioDTO;
import com.heinsohn.model.Usuario;

@RestController
@RequestMapping("usuario")
public class UsuarioR {
	@Autowired
	private UsuarioDTO dto;
	
	@GetMapping
	public List<Usuario>getAll(){
		return (List<Usuario>) dto.findAll();
	}
	
	@PostMapping
	public Usuario guardarDato(@RequestBody Usuario usuario) {
		return dto.save(usuario);
	}
	
	@PutMapping
	public Usuario actualizarUsuario(@RequestBody Usuario usuario) {
		try {
			dto.findById(usuario.getId()).get();
			return dto.save(usuario);
		}catch (NoSuchElementException e) {
			return null;
		}
	}
	
	@DeleteMapping
	public void BorrarPorId(@PathVariable("id") Integer Id) {
		dto.deleteById(Id);
	}
}
