package Introducao;

import java.util.Scanner;

public class IdadeDias {

	public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, total;
		System.out.println("Digite quantos anos você tem: ");
		anos=ler.nextInt();
		System.out.println("Digite quantos meses você tem: ");
		meses=ler.nextInt();
		System.out.println("Digite quantos dias você tem: ");
		dias=ler.nextInt();
		total=anos*365+meses*30+dias;
		System.out.println(total);
        		}		
	}


