programa
{
	// João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
	// Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
	// João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar.
	// Caso contrário mostrar tais variáveis com o conteúdo ZERO.

	
	funcao inicio()
	{
		real peso, excesso, multa
		const inteiro Limite = 50 
		
		escreva("\nDigite o peso comprado em tomates: ")
		leia (peso)

		excesso = peso - Limite

		se (excesso >0) {//se o peso comprado for maior ou igual a 50 quilos
			escreva ("\nOps! Você terá que pagar uma multa por excesso de peso. ")
			multa = excesso * 4
			escreva ("\nVocê pagará de multa: R$ ", multa)
		}
		senao {
			escreva ("\nNão houve excesso de peso. Você não pagará multa! ")
		}

			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 942; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */