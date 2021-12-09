package Introducao;

//custo do consumidor(cc)= custo de fábrica(cf)+0,28 custo de fábrica(cf)+0,45 custo de fábrica 

//cc=1,73cf  


import java.util.Scanner;

public class Carro {

public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		double cc,cf;
		System.out.printf("Digite o valor do custo de fábrica do automóvel ");
		cf=ler.nextDouble();
		cc=1.73* cf;
		System.out.printf("\nO valor do carro para o consumidor será de:  ");
		System.out.println(cc);
	
        		}	
}

