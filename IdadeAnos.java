package Introducao;

import java.util.Scanner;

public class IdadeAnos {

	public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		float anos, meses, rest, dias;
		System.out.println("Digite quantos dias voc� tem: ");
		dias=ler.nextInt();
		anos=dias/365;
		rest=dias%365;
		meses=rest/30;
		dias=rest%30;
		System.out.println("Sua idade em anos �: ");
		System.out.println(anos);
		System.out.println("Sua idade em meses �: ");
		System.out.println(meses);
		System.out.println("Sua idade em dias �: ");
		System.out.println(dias);
        		}		
	}
