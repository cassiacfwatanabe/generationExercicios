package HerancaAnimal;


public class ObjetoHerancaAnimal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse =  new Cavalo();
		Pregui�a sloth = new Pregui�a();
		
		dog.setNome("Martini");
		dog.setIdade(1);
		dog.emitirSom();
		
		sloth.setNome("Pregui�a");
		sloth.subirArvores();
		
	}

}
