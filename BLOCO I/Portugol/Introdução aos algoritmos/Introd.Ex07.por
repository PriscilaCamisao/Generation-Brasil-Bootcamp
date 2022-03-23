programa
{
 /*Um sistema de equações lineares do tipo: 
 , pode ser resolvido segundo mostrado abaixo : 
 
   Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.*/

	
	funcao inicio()
	{
		real A, B, C, D, E, F, X, Y
		
		escreva("Digite o valor de A: \n")
		leia(A)
		escreva("Digite o valor de B: \n")
		leia(B)
		escreva("Digite o valor de C: \n")
		leia(C)
		escreva("Digite o valor de D: \n")
		leia(D)
		escreva("Digite o valor de E: \n")
		leia(E)
		escreva("Digite o valor de F: \n")
		leia(F)

		X = (C*E)-(B*F) / (A*E)-(B*D)

		Y = (A*F)-(C*D) / (A*E)-(B*D)

		escreva(" Os valores de X e Y são, respectivamente: ", "\n",X,"\n", Y)
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 697; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */