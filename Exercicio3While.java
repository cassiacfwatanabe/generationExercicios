package Repeticao;

import java.util.Scanner;

public class Exercicio3While {
	

		public static void main(String[] args) {
		
		
	
		int idade,contador21=0,contador50=0;
		Scanner ler = new Scanner(System.in);
		  System.out.println("Digite a sua idade: ");
	  	    idade=ler.nextInt();
	   
	   
	    while(idade!=-99)
	       {
	    	
	           if(idade<21) {
	        	   contador21++;
	           }
	           if(idade>50) {
	        	   contador50++;
	           }         
	           
	          
	           }
	    
	    System.out.println(contador21);
	    System.out.println(contador50);
		}

	}


