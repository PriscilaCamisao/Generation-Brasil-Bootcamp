package org.generation.farmacia.controller;

import java.util.List;

import org.generation.farmacia.model.CategoriaModel;
import org.generation.farmacia.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "*", allowedHeaders = "*")
@RequestMapping ("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List <CategoriaModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<CategoriaModel> getByEntity(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/texto {texto}")
	public ResponseEntity<List <CategoriaModel>> getByTexto(@PathVariable String texto){
		return ResponseEntity.ok(repository.findAllByTextoContainingIgnoreCase(texto));
	}
	@PostMapping
	public ResponseEntity<CategoriaModel> post(@RequestBody CategoriaModel titulo){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(titulo));
	}
	@PutMapping
	public ResponseEntity<CategoriaModel> put(@RequestBody CategoriaModel titulo){
		return ResponseEntity.ok(repository.save(titulo));
	}
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
}
