package Arrays;

import java.util.Scanner;

public class Exercicio1Vetor {
	
	public static void main(String[] args){
		
		
    int x=0, maior=0;
	int n[]	= new int [5];
	Scanner ler = new Scanner(System.in);
				for(x=0;x<5;x++)
				{ System.out.print("Digite um valor");
				  n[x]=ler.nextInt();
						}
		         for(x=0;x<5;x++)
				{  System.out.printf("\t",n[x]);
		               }  
			 for (x=0;x<5;x++)
			 { if(n[x]>maior);
			        maior=n[x];}
		
			 System.out.printf("\nO maior valor digitado foi: "+maior);
			}	
		
	}


