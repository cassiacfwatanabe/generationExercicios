package Condicional;

import java.util.Scanner;

public class QualOMaior {

public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		double a,b,c;
		System.out.printf("Digite um valor A ");
		a=ler.nextDouble();
		System.out.printf("Digite um valor B ");
		b=ler.nextDouble();
		System.out.printf("Digite um valor C ");
		c=ler.nextDouble();
		
		if(a>b && a>c )
		
		{System.out.printf("O maior valor � A ");}
	
		else if(b>a && b>c)
		
		{System.out.printf("O maior valor � B");}
		
		else
		{System.out.println("O maior valor � C");}
	
	
	
}	
	
}
