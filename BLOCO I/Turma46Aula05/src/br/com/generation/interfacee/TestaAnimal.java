package br.com.generation.interfacee;

public class TestaAnimal {

	public static void main(String[] args) {
		
		AnimalComer ac = new AnimalComer();
		
		ac.fazerAnimalComer(new Cachorro("Pluto"));
		ac.fazerAnimalComer(new Cavalo());
		
		
	}

}
