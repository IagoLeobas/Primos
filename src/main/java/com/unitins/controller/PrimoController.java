package com.unitins.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unitins.db.Database;
import com.unitins.model.Primo;
import com.unitins.repository.PrimoRepository;

@RestController
@RequestMapping("/primos")
public class PrimoController {
	
	@Autowired
	private PrimoRepository primoRepository;

	@GetMapping
	public List<Primo> listAll() {
		String dadoDoBanco = Database.buscarDadoDoBanco();
		System.out.print("Resultado: " + dadoDoBanco);
		return primoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Primo getById(@PathVariable Long id) {
		return primoRepository.findById(id).get();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Primo save(@RequestBody Primo primo) {
		return primoRepository.save(primo);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		primoRepository.deleteById(id);
		return "Primo " + id + " deletado com sucesso!";
	}
}
