package Animal;

public class Animal {
	
	private String nome;
	private String sexo;
	private String raca;
	
	public Animal (String nome, String sexo, String raca) {
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;		
	}
	
	public void dormir () {
		System.out.print("Dormindo");
	}
	
	
	public void caminhar () {
		System.out.print("Caminhando");
	}
	
	public void correr () {
		System.out.print("Correndo");
	}
	
	public void emitirSom () {
		System.out.print("Emitindo Som");
	}
	


}
