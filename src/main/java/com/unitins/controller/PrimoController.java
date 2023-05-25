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

import com.unitins.model.Primo;
import com.unitins.service.Regras;
import com.unitins.repository.PrimoRepository;

@RestController
@RequestMapping("/primos")
public class PrimoController {

	@Autowired
	private PrimoRepository primoRepository;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Primo> listarTodos() {
		// imprime o nº informado a API e imprime a resposta console
		Regras.imprimirResultado();
		return primoRepository.findAll();
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Primo buscarPorId(@PathVariable Long id) {
		System.out.println("Número buscado com sucesso");
		return primoRepository.findById(id).get();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Primo salvar(@RequestBody Primo primo) {
		System.out.println("Número adicionado com sucesso");
		return primoRepository.save(primo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletar(@PathVariable Long id) {
		primoRepository.deleteById(id);
		System.out.println("Primo " + id + " deletado com sucesso!");
	}
}
