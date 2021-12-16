package HerancaAnimal;


public class ObjetoHerancaAnimal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse =  new Cavalo();
		Preguiça sloth = new Preguiça();
		
		dog.setNome("Martini");
		dog.setIdade(1);
		dog.emitirSom();
		
		sloth.setNome("Preguiça");
		sloth.subirArvores();
		
	}

}
