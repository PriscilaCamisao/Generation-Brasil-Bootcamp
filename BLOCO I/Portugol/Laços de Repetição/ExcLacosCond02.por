programa
{
	// Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
	// E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
	// Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
	// A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
	
	
	funcao inicio()
	{
		real horas, valor, salario, extra
		
		escreva("\nDigite o número de horas trabalhadas: ")
		leia (horas)

		extra = horas - 50
		
		se (horas <= 50) {//se as horas trabalhadas forem abaixo de 50 horas
			salario = horas * 10
			escreva ("Você receberá de salário: R$", salario)

		}
		senao se (horas > 50) {//se as horas trabalhadas forem acima de 50 horas
			salario = extra * 20
			valor = salario + 500
			escreva ("Você receberá de salário: R$", valor)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 951; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */