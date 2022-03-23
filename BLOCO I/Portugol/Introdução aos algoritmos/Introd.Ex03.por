programa
{
 	/* 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos
	e mostre-o expresso em horas, minutos e segundos. */
	
	funcao inicio()
	{
 
		real  H, M 
		inteiro S, segTotal
		
		escreva("Digite a quantidade total de segundos: \n")
		leia(segTotal)

		H = segTotal / 3600
		M = (segTotal - ( H * 3600)) / 60
		S = segTotal % 6

		escreva( H, ":", M, ":", S)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 241; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */