package org.generation.blogPessoal.blogPessoal.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.generation.blogPessoal.service.UsuarioService;


//Ramdom é um tipo de porta para não dar conflito.
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTests {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start() {
										//ID usuario / Nome / Usuario(email) / Senha / Link da foto
		usuarioRepository.save(new Usuario(0L, "Ramon Daniel Santos", "ramonzito@clovis.com", "123456789", "https://i.imgur.com/FETvs2O.jpgn"));
		
		usuarioRepository.save(new Usuario(0L, "Robson Carmo", "robsonbruxinho@carmo.com", "mago1234", "https://i.imgur.com/FETvs2O.jpgn"));
		
		usuarioRepository.save(new Usuario(0L, "Paola Bracho Santos", "ataldausurpadora.com", "carlosdaniel", "https://i.imgur.com/FETvs2O.jpgn"));
	}
	
	
	@Test
	@DisplayName("Deve retornar apenas um usuário")
	public void deveRetornarUmUsuario() {
		
		Optional<Usuario> usuario = usuarioRepository.findByUsuario("ramonzito@clovis.com");
		assertTrue(usuario.get().getUsuario().equals("ramonzito@clovis.com"));	
	}
	
	
	@Test
	@DisplayName("Deve retornar 3 usuários")
	
	public void deveRetornarTresUsuarios() {
		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Santos");
		assertEquals(3, listaDeUsuarios.size());
		assertTrue(listaDeUsuarios.get(0).getNome().equals("Ramon Daniel Santos"));
		assertTrue(listaDeUsuarios.get(1).getNome().equals("Robson Carmo"));
		assertTrue(listaDeUsuarios.get(3).getNome().equals("Paola Bracho Santos"));
	}
	
	@AfterAll
	public void end() {
		usuarioRepository.deleteAll();
	}
}
