package AtividadeDois;

public class PessoaJuridica extends Funcionario {
	
	
	@Override
	public double calculaSalario (double valorBruto, double imposto) {
		return valorBruto -  imposto;
	}

	public PessoaJuridica(long id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
		
	}


	

}
