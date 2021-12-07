programa
{
	
	funcao inicio()
	{
	     inteiro n=1, contador=0
	     real soma = 0.0, media=0.0 

	     
               
	     enquanto(n>0)
		{
			escreva("Digite um número: ")
			leia(n)
		     soma = soma+n
		     contador++
		     media=soma/contador
		}
		  
		    escreva("\nA soma dos valores fornecidos é de: ",soma)
		    escreva("\nO total de valores que você digitou foi: ", contador )
		    escreva("\nA média da soma dos valores fornecidos é de: ",media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 479; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */