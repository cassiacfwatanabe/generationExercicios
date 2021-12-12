package Repeticao;

import java.util.Scanner;

public class Exercicio2For {

	
	   public static void main(String[] args){
	       
	        int num, contPar = 0, contImpar = 0;
	        Scanner ler = new Scanner(System.in);
	        for(int i = 1; i <= 10; i++){
	            System.out.println("Digite um número : ");
	     num = ler. nextInt();
	            
	            if(num % 2 == 0)
	            {
	                contPar++; }
	            else
	            {
	            	contImpar++;}
	            }
	        System.out.println(contPar);
	        System.out.println("\nE " + contImpar + " números ímpares");
	        }
	
}
