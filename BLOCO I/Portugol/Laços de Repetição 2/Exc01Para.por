programa
{
	
	funcao inicio()
	{
 	
		real salario, filhos,mediaSalario = 0 , mediaFilhos = 0, maiorSalario = 0, percentual = 0, contador 
		
		para(contador = 1; contador<=20; contador++){
			escreva("\nOlá, qual o seu salário? \n")
			leia(salario)
			mediaSalario = mediaSalario + salario			
			
			escreva("\nQuantos filhos você tem?\n")
			leia(filhos)
			mediaFilhos = mediaFilhos + filhos

			se(salario > maiorSalario){
				maiorSalario = salario
			}senao{
				maiorSalario = maiorSalario
			}se(salario <=100){
				percentual = percentual + 1
			}
			mediaSalario = mediaSalario /20
			mediaFilhos = mediaFilhos / 20
			percentual = (percentual * 100) /20

		}
			escreva("\nA média do salário da população é: ", mediaSalario)
			escreva("\nA média do número de filhos é: ", mediaFilhos)
			escreva("\nO maior salário é: ", maiorSalario)
			escreva("\nO percentual de pessoas com salário até R$ 100,00 é: ", percentual, "%")
			
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 944; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */