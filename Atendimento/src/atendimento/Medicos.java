package atendimento;

public class Medicos extends Pessoa{
	
	private int crm;

	
	public Medicos() {
		this.crm = 0;
	}
	
	public Medicos(String nome, String cpf, int crm) {
		super(nome, cpf);
		this.crm = crm;
	}
	

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		if (crm > 0)
			crm = crm;
	}
	
}
