package br.com.generation.teste;

import br.com.generation.model.Caminhao;
import br.com.generation.model.Motorista;
import br.com.generation.model.Seguro;
import br.com.generation.repository.Motoristas;

public class ConsultaCobertura {

	public static void main(String[] args) {
		
		
		Motoristas motoristas = new Motoristas();
		// Motorista motorista = motoristas.porNome("José");
		// String cobertura = motorista.getCaminhao().getSeguro().getCobertura();
		
		String cobertura = motoristas.porNome("João")
							.flatMap(Motorista::getCaminhao)
							.flatMap(Caminhao::getSeguro)
							.map(Seguro::getCobertura)
							.orElse("Sem seguro!");
							
		System.out.println("A cobertura é: " + cobertura);
	}

}
