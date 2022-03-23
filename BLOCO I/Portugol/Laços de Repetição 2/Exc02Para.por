programa
{
	
	funcao inicio()
	{
    inteiro numero, soma = 0
	
		para(numero = 0; numero <= 500; numero++){
			
			se(numero % 2 != 0 e numero % 3 == 0){
				soma = soma + numero
			}
		}
		escreva("A soma dos valores ímpares e múltiplos de 3 fica: ", soma)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */