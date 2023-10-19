package AtividadeDois;

import AtividadeUm.Gamer;

public class Principal {

	public static void main(String[] args) {
		
		Jornada j = new Jornada (1, "João", "9886698", 6985, "rua das flores");
		System.out.println(j.calculaSalario(60, 50));
		
		Horista h = new Horista (1, "João", "9886698", 6985, "rua das flores");
		System.out.println(h.calculaSalario(60, 50));
		
		PessoaJuridica p = new PessoaJuridica (1, "João", "9886698", 6985, "rua das flores");
		System.out.println(j.calculaSalario(5000, 1000));
		
		
		
		
		
		
	

	}

	

}
