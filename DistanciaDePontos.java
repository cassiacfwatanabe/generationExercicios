package Introducao;

import java.util.Scanner;
import java.math.*;

public class DistanciaDePontos {
public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		double x1,x2,y1,y2,dist;
		System.out.printf("Digite a coordenada do primeiro ponto: ");
		x1=ler.nextDouble();
		System.out.printf("Digite a coordenada do segundo ponto: ");
		x2=ler.nextDouble();
		System.out.printf("Digite a ordenada do primeiro ponto: ");
		y1=ler.nextDouble();
		System.out.printf("Digite a ordenada do primeiro ponto: ");
		y2=ler.nextDouble();
		dist = Math.sqrt((x2-x1)*(x2-x1)+((y2-y1)*(y2-y1)));
		System.out.printf("\nA distância dos pontos é: ");
		System.out.print(dist);
		
        		}		
}
