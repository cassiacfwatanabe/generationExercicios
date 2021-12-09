package Introducao;

import java.util.Scanner;

public class EventoEmSegundos {
public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		float horas, minutos, segundos;
		System.out.println("Digite quanto tempo o evento durou em segundos: ");
		segundos=ler.nextInt();
		horas = segundos/3600; 
		          minutos = (segundos % 3600) / 60 ;
		          segundos = (segundos % 3600) % 60 ;

		System.out.println("O evento durou em horas: ");
		System.out.println(horas);
		System.out.println("Em minutos: ");
		System.out.println(minutos);
		System.out.println("Em segundos: ");
		System.out.println(segundos);
        		}		

}
