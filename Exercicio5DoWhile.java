package Repeticao;

import java.util.Scanner;

public class Exercicio5DoWhile {
	public static void main(String[] args){
		
		int soma=0, num;
		Scanner ler = new Scanner(System.in);
		
	    do{
	    	System.out.println("Digite um valor inteiro : ");
		    num=ler.nextInt();
	        if(num==0){
	            soma=soma + num;
	        }
	    }while(num > 0);

	    System.out.println("A soma é :"+ soma);
		
		
	}
}
