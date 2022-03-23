programa
{
	// Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	// a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	// b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

	inclua biblioteca Util
	funcao inicio()
	{

		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]
		inteiro i, j
		

		para (i = 0; i < 4; i++) {
			para (j = 0; j < 6; j++) {
				N1[i][j] = Util.sorteia(-100, 100)
				N2[i][j] = Util.sorteia(-100, 100)
				M1[i][j] = N1[i][j] + N2[i][j]
				M2[i][j] = N1[i][j] - N2[i][j]

			}
			
		}
		para (i = 0; i < 4; i++) {
			para (j = 0; j < 6; j++) {
			escreva ("\n Valor de M1[",i,"][",j,"] = ",M1[i][j])
			escreva ("\n Valor de M2[",i,"][",j,"] = ",M2[i][j])


			}
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 821; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */