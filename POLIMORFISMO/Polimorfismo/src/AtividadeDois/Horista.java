package AtividadeDois;

public class Horista extends Funcionario {
	
	@Override
	public double calculaSalario (double valorHora, double quantHora) {
		return valorHora *  quantHora;
	}

	public Horista(long id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	
	}



}
