package com.unitins.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unitins.model.Primo;
import com.unitins.repository.PrimoRepository;

@RestController
@RequestMapping("/primos")
public class PrimoController {
	
	@Autowired
	private PrimoRepository primoRepository;

	@GetMapping
	public List<Primo> listar() {
		return primoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Primo adicionar(@RequestBody Primo primo) {
		return primoRepository.save(primo);
	}
}
