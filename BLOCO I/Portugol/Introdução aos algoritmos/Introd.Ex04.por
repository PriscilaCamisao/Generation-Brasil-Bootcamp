programa
{
 /* Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: */
	
inclua biblioteca Matematica --> mat
	funcao inicio()
	{
 
		real A, B, C, D, R, S
	
		escreva("Digite o valor de A: \n")
		leia(A)
		escreva("Digite o valor de B: \n")
		leia(B)
		escreva("Digite o valor de C: \n")
		leia(C)

		R = mat.potencia((A+B), 2.0)
		S = mat.potencia((B+C), 2.0)

		D = (R + S) / 2
		escreva(" O valor da expressão vale: ", D)

		

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 488; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */