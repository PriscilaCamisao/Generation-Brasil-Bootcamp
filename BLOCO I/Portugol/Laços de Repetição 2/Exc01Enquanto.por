programa
{
   /*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
	apresente no final o total do somatório, a média e o total de valores lidos. O programa
	deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
	positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
	negativo.*/
	
	funcao inicio()
	{
	real valor ,contador = 0, soma = 0, media
			
			escreva("Digite um valor \n")
			leia(valor)
			
		enquanto(valor > 0){
			escreva("Digite outro valor: \n")
			leia(valor)
			
			soma = valor + valor
			contador = contador + 1
		
		}
		media = soma / contador 
		escreva("\nO de números de valores escrito foi: \n", contador)
		escreva("\nA soma dos valores é: \n", soma)
		escreva("\nA média dos valores foi: \n", media)
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 806; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */