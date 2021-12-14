package POO;

public class ProdutoEletronico {

	String cor;
	String marca;
	boolean ligado;
	double tamanho;
	
	public void ligar() {
	 ligado=true; }
	
	public void desligar() {
	  ligado = false;  }

	public void status() {
		
		System.out.println("A cor desse produto é: "+this.cor);
		System.out.println("A marca desse produto é: "+this.marca);
		System.out.println("O tamanho desse produto é: "+this.tamanho);
		
	}
	
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
}
