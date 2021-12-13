package Arrays;

import java.util.Scanner;

public class Exercicio2Vetor {

	public static void main(String[] args){
	
	
	int x=0, maior=0, contador=0 ,valormax=0, acm=0 , b=06;
    int n[]= new int[10];
    double media=1.00 ;
    Scanner ler = new Scanner(System.in);
     for(x=0;x<10;x++)
	{ System.out.println("Digite o valor do dado: ");
      n[x]=ler.nextInt();
			}
      for(x=0;x<10;x++)
	{ System.out.println("\t"+n[x]);
		}  
      for(x=0;x<10;x++)	
	  
	  if(n[x]==6)
	  { 
	  	valormax++;
	  	}
	  b= valormax++/6;
			  System.out.println("\nA quantidade de vezes que o valor seis foi digitado foi de: "+b);
	  for(x=0;x<10;x++)	
      { 
      	media=n[x]++/10;
      	}
	  System.out.println("\nA média aritmética dos valores jogados é : "+media);
  
}
}

