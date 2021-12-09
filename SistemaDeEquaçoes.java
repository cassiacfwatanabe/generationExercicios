package Introducao;

import java.util.Scanner;
//ax + by= c; dx+ey = f; x=((c*E)-(b*f))/((a*E)-(b*d)); y=((a*f)-(c*d))/((a*E)-(b*d)) 
public class SistemaDeEquaçoes {

public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		int a,b,c,d,e,f,x,y;
		System.out.println("Digite o valor de a: ");
		a=ler.nextInt();
		System.out.println("\nDigite o valor de b: ");
		b=ler.nextInt();
		System.out.println("\nDigite o valor de c: ");
		c=ler.nextInt();
		System.out.println("\nDigite o valor de d: ");
		d=ler.nextInt();
		System.out.println("\nDigite o valor de e: ");
		e=ler.nextInt();
		System.out.println("\nDigite o valor de f: ");
		f=ler.nextInt();
		x=((c*e)-(b*f))/((a*e)-(b*d));
		y=((a*f)-(c*d))/((a*e)-(b*d));
		System.out.println(x);
		System.out.println(y);
        		}	
	
	
	
	
}
