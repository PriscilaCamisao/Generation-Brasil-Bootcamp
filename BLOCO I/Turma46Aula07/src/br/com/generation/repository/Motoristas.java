package br.com.generation.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import br.com.generation.model.Caminhao;
import br.com.generation.model.Motorista;
import br.com.generation.model.Seguro; // crtl + shift + o para importar

public class Motoristas { // Simulação do banco de dados

	private Map<String, Optional<Motorista>> motoristas = new HashMap<>();

	public Motoristas() {
		
		Seguro seguro = new Seguro("Parcial - Não cobre casos de roubos.", 5000.00);
		Caminhao caminhao = new Caminhao("Mercedes Bensz", Optional.ofNullable(seguro));
		
		Optional<Motorista> motoristaJoao = Optional.of(new Motorista("João", 40, Optional.ofNullable(caminhao)));
		Optional<Motorista> motoristaJose = Optional.of(new Motorista("José", 25, Optional.ofNullable(null)));
		
		motoristas.put("João", motoristaJoao);
		motoristas.put("José", motoristaJose);
	}

	public Optional<Motorista> porNome(String nome) {
		return motoristas.get(nome);
	}
}
