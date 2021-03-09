package atendimento;

public class Paciente extends Pessoa {
	
	private int numSenha;

	
	public Paciente() {
		
	}
	
	public Paciente(String nome, String cpf, int senha) {
		super(nome, cpf);
		setNumSenha(numSenha);
	}
	
	
	public int getNumSenha() {
		return numSenha;
	}

	public void setNumSenha(int numSenha) {
		if (numSenha > 0)
			this.numSenha = numSenha;
	}
}