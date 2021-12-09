package Introducao;
//r=(a+b)^2 

//s=(b+c)^2 
	
//d=(r+s)/2 

import java.util.Scanner;

public class ExpressaoRDS {

public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		int a,b,c,d,r,s;
		System.out.println("Digite o valor de a: ");
		a=ler.nextInt();
		System.out.println("Digite o valor de b: ");
		b=ler.nextInt();
		System.out.println("Digite o valor de c: ");
		c=ler.nextInt();
		r=(a+b)*(a+b);
		s=(b+c)*(b+c);
		d=(r+s)/2;
		System.out.println("O Valor da equação d=(r+s)/2, onde r=(a+b)*(a+b) e s=(b+c)*(b+c) é:");
		System.out.println(d);
        		}		
}
