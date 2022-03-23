programa
{
	// Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores
	// dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
	
	funcao inicio()
	{
		inteiro i, j, matriz[3][3], soma=0, somaDiagonal=0
		
		para (i = 0; i <3; i++) {

			para (j = 0; j <3; j++) {

				escreva ("\nDigite um numero para a matriz[" ,i, "][" ,j, "]: ")
				leia (matriz[i][j])

				soma = soma + matriz[i][j]
			}
		}

		para (i = 0; i <3; i++) {

			para (j = 0; j <3; j++) {

				se (i == j) {
				somaDiagonal = somaDiagonal + matriz[i][j]
					
				}

				
			}
		}

		escreva ("\nO valor da soma da matriz é: ", soma)
		escreva ("\nO valor da soma da diagonal da matriz é: ", somaDiagonal)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 768; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */