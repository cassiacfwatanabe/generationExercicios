package POO;
import java.util.Scanner;
public class Eletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico p1 = new ProdutoEletronico();
		
		{
			
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite a cor do eletrônco");
			p1.cor=ler.nextLine();
			System.out.println("Digite a marca do eletrônico ");
			p1.marca=ler.nextLine();
			System.out.println("Digite o tamanho do eletrônico");
			p1.tamanho=ler.nextDouble();
			p1.status();
			p1.ligar();
			
			
		}
	

	}

}
