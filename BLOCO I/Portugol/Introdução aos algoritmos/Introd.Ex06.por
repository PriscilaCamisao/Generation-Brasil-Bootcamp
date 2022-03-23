programa
{
 	/*Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
	P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
	A fórmula que efetua tal cálculo é: */
	
inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real x1, x2, y1, y2, d, f 
		real raiz
		
		escreva("Digite o valor de x1: \n")
		leia(x1)
		escreva("Digite o valor de x2: \n")
		leia(x2)
		escreva("Digite o valor de y1: \n")
		leia(y1)
		escreva("Digite o valor de y2: \n")
		leia(y2)
		f = mat.potencia ((x2-x1), 2.0) + mat.potencia((x2-x1), 2.0)
		d = mat.raiz( f, 2.0)

		escreva("O valor da fórmula é: ", d)
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 641; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */