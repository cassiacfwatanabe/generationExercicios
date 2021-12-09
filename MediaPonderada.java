package Introducao;

import java.util.Scanner;

public class MediaPonderada {
public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		int nota1,nota2,nota3,media;
		System.out.println("Digite a nota1: ");
		nota1=ler.nextInt();
		System.out.println("\nDigite a nota2: ");
		nota2=ler.nextInt();
		System.out.println("\nDigite a nota3: ");
		nota3=ler.nextInt();
		
	    media= ((2*nota1)+(3*nota2)+(5*nota3))/10;
	    System.out.println("A média ponderada é de: ");
		System.out.println(media);
		
        		}		
}
