 package Repeticao;
 
 import java.util.Scanner;

public class Exercicio6DoWhile {
	public static void main(String[] args){
		
		int soma=0, num, cont=0;
		double media=0.0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um valor inteiro : ");
	    num=ler.nextInt();
		do{
		    if(num%3==0){
		    	cont++;
		        soma= soma+ num;
		    }
		}while(num > 0);
		
		media= soma/cont++;
		System.out.println(media);
		
	}
}