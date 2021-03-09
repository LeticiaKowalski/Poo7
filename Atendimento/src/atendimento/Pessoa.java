package atendimento;

public class Pessoa {
	
	private String cpf;
	private String nome;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n- PACIENTE -");
		builder.append("\n* Nome: ");
		builder.append(nome);
		builder.append("\n* CPF: ");
		builder.append(cpf);
		return builder.toString();
	}
}
