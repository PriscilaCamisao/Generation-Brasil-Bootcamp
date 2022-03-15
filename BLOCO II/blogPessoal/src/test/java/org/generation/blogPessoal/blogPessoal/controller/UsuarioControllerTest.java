package org.generation.blogPessoal.blogPessoal.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.service.UsuarioService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsuarioControllerTest {
	
	
	/**
	 * Injeta um objeto da Classe TestRestTemplate, responsável por fazer requisições HTTP (semelhante ao Postman)
	 */
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Test
	@Order(1)
	public void deveCadastrarUmUsuario() {
		
		/**
		 * Cria um objeto da Classe Usuario e insere dentro de um Objeto da Classe HttpEntity (Entidade HTTP)
		 */
		HttpEntity<Usuario> requisicao = new HttpEntity<Usuario>(new Usuario(0L, "Zé Mario", "zemario@ovo.com", "ovofrito123", "https://i.pinimg.com/originals/a5/75/de/a575de26e864c95e1ff43bfbea2f4be2.jpg\r\n"));
		
		/**
		 * Cria um Objeto da Classe ResponseEntity (corpoResposta), que receberá a Resposta da Requisição que será 
		 * enviada pelo Objeto da Classe TestRestTemplate.
		 * 
		 * Na requisição HTTP será enviada a URL do recurso (/usuarios/cadastrar), o verbo (POST), a entidade
		 * HTTP criada acima (corpoRequisicao) e a Classe de retornos da Resposta (Usuario).
		 */
		ResponseEntity<Usuario> resposta = testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST, requisicao, Usuario.class);
		
		/**
		 * Verifica se a requisição retornou o Status Code CREATED (201) 
		 * Se for verdadeira, o teste passa, se não, o teste falha.
		 */
		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
		
		/**
		 * Verifica se o Atributo Usuario do Objeto da Classe Usuario retornado no Corpo da Requisição 
		 * é igual ao Atributo Usuario do Objeto da Classe Usuario Retornado no Corpo da Resposta
		 * Se for verdadeiro, o teste passa, senão o teste falha.
		 */
		assertEquals(requisicao.getBody().getUsuario(), resposta.getBody().getUsuario());
	}
	
	@Test
	@Order(2)
	private void deveAtualizarUmUsuario() {
		
		/**
		 * Persiste um objeto da Classe Usuario no Banco de dados através do Objeto da Classe UsuarioService
		 */
		Optional<Usuario> usuarioCreate = usuarioService.cadastrarUsuario(new Usuario(0L, 
				"TinkWink", "tinkwink@telletubies.com.br", 
				"bolsavermelha", "https://pbs.twimg.com/profile_images/3457438261/e839142b1e74a6c69ce06189edf5a4e7_400x400.jpeg\r\n"));

		
		Usuario usuarioUpdate = new Usuario(usuarioCreate.get().getId(),
				"TinkWink da Silva", "tinkwink@telletubies.com.br", 
				"bolsavermelha", "https://pbs.twimg.com/profile_images/3457438261/e839142b1e74a6c69ce06189edf5a4e7_400x400.jpeg\r\n");
				
		/**
		 * Cria o mesmo objeto da Classe Usuario que foi persistido no Banco de dados na linha anterior para
		 * simular uma duplicação de usuário e insere dentro de um Objeto da Classe HttpEntity (Entidade HTTP)
		 */
		HttpEntity<Usuario> requisicaoAtualizacao = new HttpEntity<Usuario>(usuarioUpdate);
		
		ResponseEntity<Usuario> respostaAtualizacao = testRestTemplate
				.withBasicAuth("root", "root")
				.exchange("/usuarios/atualizar", HttpMethod.PUT, requisicaoAtualizacao, Usuario.class);
		
		/**
		 * Verifica se a requisição retornou o Status Code BAD_REQUEST (400), que indica que o usuário já existe no
		 * Banco de dados. 
		 * Se for verdadeira, o teste passa, senão o teste falha.
		 */
		assertEquals(HttpStatus.OK, respostaAtualizacao.getStatusCode());
	}

}
