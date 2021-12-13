package Arrays;

import java.util.Scanner;

public class Exercicio4Matriz{

	public static void main(String[] args) {
       int mat[][]= new int [3][3];
       int soma;
       Scanner ler = new Scanner(System.in);
		for(int linha=0;linha<3;linha++)
		{ 
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.print("Digite um valor: ");
				mat[linha][coluna]=ler.nextInt();	

	}  
		}
		for(int linha=0;linha<3;linha++)
		{ 
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.print(mat[linha][coluna]+"\t");
				
			}    System.out.println();
			}
				
		   
			soma=mat[0][0]+mat[1][1]+mat[2][2];
		    System.out.println("\nA soma da diagonal principal é: "+ soma);
	        
	}}




