programa
{
	// Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos,
	// escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também
	//quantas foram as ocorrências da maior pontuação.

	inclua biblioteca Util
	funcao inicio()
	{
		
		inteiro valor[10], cont, ocorr = 0, maior = 0
		real soma = 0.0

		para (cont = 0; cont < 10; cont++) {
			valor[cont] = Util.sorteia (1, 6)

			se (valor[cont] > maior) {
				maior = valor[cont]
				ocorr = 1
			}
			senao se (valor[cont] == maior) {
				ocorr++
			}
			soma+=valor[cont]
		}

		para (cont = 0; cont < 10; cont++) {
			escreva ("{", valor[cont], "}")
			
		}

		escreva ("\nMédia: ", soma/10, "\nOcorrências da maior pontuação: ", ocorr)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 775; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */