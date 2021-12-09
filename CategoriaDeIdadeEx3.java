package Condicional;

import java.util.Scanner;
//10-14 infantil
//15-17 juvenil
//18-25 adulto

public class CategoriaDeIdadeEx3 {

public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		double idade;
		System.out.printf("Digite uma idade ");
		idade=ler.nextDouble();
		
		if(idade>=10 && idade<=14)
		
		{System.out.printf("Categoria Infantil ");}
	
		else if(idade>14 && idade<=17)
		
		{System.out.printf("Categoria Juvenil");}
		
		else if(idade>17 && idade<=25)
		{System.out.println("Categoria Adulto");}
		
		else
		{System.out.println("Essa idade não corresponde a nenhuma categoria");}
	
	
	
}	
}
