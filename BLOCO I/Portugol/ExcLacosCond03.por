programa
{
	// Desenvolva um sistema em que: Leia 4 (quatro) números
	// Calcule o quadrado de cada um;
	// Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	// Caso contrário, imprima os valores lidos e seus respectivos quadrados.

	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real resultado, expoente
		inteiro valor
		

		escreva ("Iremos calcular o quadrado de cada um dos seguintes numeros: 4, 16, 32, 64 ")
		escreva ("\nDigite um dos seguintes valores citados acima: ")
		leia (valor)
		escreva ("\nDigite o expoente: ")
		leia (expoente)
		
		resultado = mat.potencia(valor, expoente)

		escreva (valor+" Elevado a "+ expoente+ " é =" + resultado)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 708; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */