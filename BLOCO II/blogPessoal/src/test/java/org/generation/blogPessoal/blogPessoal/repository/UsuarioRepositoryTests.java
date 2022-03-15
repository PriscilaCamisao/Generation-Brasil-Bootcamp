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
		
		/** 
		 * Persiste (Grava) 4 Objetos Usuario no Banco de dados
		 ID usuario / Nome / Usuario(email) / Senha / Link da foto*/
		usuarioRepository.save(new Usuario(0L, "Ramon Daniel Santos", "ramonzito@clovis.com", "123456789", "https://i.imgur.com/FETvs2O.jpgn"));
		
		usuarioRepository.save(new Usuario(0L, "Robson Carmo", "robsonbruxinho@carmo.com", "mago1234", "https://i.imgur.com/FETvs2O.jpgn"));
		
		usuarioRepository.save(new Usuario(0L, "Paola Bracho Santos", "ataldausurpadora.com", "carlosdaniel", "https://i.imgur.com/FETvs2O.jpgn"));
	}
	
	
	@Test
	@DisplayName("Deve retornar apenas um usuário")
	public void deveRetornarUmUsuario() {
		
		/**
		 *  Executa o método findByUsuario para buscar um usuario pelo nome (joao@email.com.br)
		 */
		Optional<Usuario> usuario = usuarioRepository.findByUsuario("ramonzito@clovis.com");
		
		/**
		 *  Verifica se a afirmação: "É verdade que a busca retornou o usuario joao@email.com.br" é verdadeira
		 *  Se for verdaeira, o teste passa, senão o teste falha. 
		 */
		assertTrue(usuario.get().getUsuario().equals("ramonzito@clovis.com"));	
	}
	
	
	@Test
	@DisplayName("Deve retornar 3 usuários")
	
	public void deveRetornarTresUsuarios() {
		
		/**
		 *  Executa o método findAllByNomeContainingIgnoreCase para buscar todos os usuarios cujo nome contenha
		 *  a palavra "Silva"
		 */
		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Santos");
		
		/**
		 * Verifica se a afirmação: "É verdade que a busca retornou 3 usuarios, cujo nome possua a palavra Silva" 
		 * é verdadeira
		 * Se for verdadeira, o teste passa, senão o teste falha.
		 */
		assertEquals(3, listaDeUsuarios.size());
		
		/**
		 *  Verifica se a afirmação: "É verdade que a busca retornou na primeira posição da Lista o usuario 
		 * João da Silva" é verdadeira
		 * Se for verdadeira, o teste passa, senão o teste falha.
		 */
		assertTrue(listaDeUsuarios.get(0).getNome().equals("Ramon Daniel Santos"));
		
		/**
		 *  Verifica se a afirmação: "É verdade que a busca retornou na segunda posição da Lista a usuaria 
		 * Manuela da Silva" é verdadeira
		 * Se for verdadeira, o teste passa, senão o teste falha.
		 */
		assertTrue(listaDeUsuarios.get(1).getNome().equals("Robson Carmo"));
		
		/**
		 *  Verifica se a afirmação: "É verdade que a busca retornou na primeira posição da Lista a usuaria 
		 * Adriana da Silva" é verdadeira
		 * Se for verdadeira, o teste passa, senão o teste falha.
		 */
		assertTrue(listaDeUsuarios.get(3).getNome().equals("Paola Bracho Santos"));
	}
	
	@AfterAll
	public void end() {
		usuarioRepository.deleteAll();
	}
}
