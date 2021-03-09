package atendimento;

public class Classificacao {
	
	private int prior;
	
	private FilaP primPaciente;
	private FilaP ultPaciente;
	private FilaM primMedico;
	private FilaM ultMedico;

	
	public Classificacao() {
		this.primPaciente = null;
		this.ultPaciente = null;
		this.primMedico = null;
		this.ultMedico = null;
	}


	public int getPrior() {
		return prior;
	}

	public void setPrior(int prior) {
		this.prior = prior;
	}


	public FilaP getPrimPaciente() {
		return primPaciente;
	}


	public void setPrimPaciente(FilaP primPaciente) {
		this.primPaciente = primPaciente;
	}


	public FilaP getUltPaciente() {
		return ultPaciente;
	}


	public void setUltPaciente(FilaP ultPaciente) {
		this.ultPaciente = ultPaciente;
	}


	public FilaM getPrimMedico() {
		return primMedico;
	}


	public void setPrimMedico(FilaM primMedico) {
		this.primMedico = primMedico;
	}


	public FilaM getUltMedico() {
		return ultMedico;
	}


	public void setUltMedico(FilaM ultMedico) {
		this.ultMedico = ultMedico;
	}
	
	
	public boolean vazioM() {
		return (this.primMedico == null);
	}
	
	public boolean vazioP() {
		return (this.primPaciente == null);
	}
	
	public void inserirMedico(Medicos m) {
		FilaM lmedico = new FilaM(m);
		
		if (this.vazioM()) 
			this.ultMedico = lmedico;
		lmedico.setProx(this.primMedico);
		this.primMedico = lmedico;
	}
	
	public void inserirPaciente(Paciente p) {
		FilaP lpaciente = new FilaP(p);
		
		if (this.vazioP())
			this.ultPaciente = lpaciente;
		lpaciente.setProx(this.primPaciente);
		this.primPaciente = lpaciente;
	}
	
	public String imprimirMedico() {
		String mensagem = "";
		
		if (this.vazioM()) {
			mensagem = "Lista vazia!";
		} else {
			FilaM atual = this.primMedico;
			while (atual != null) {
				mensagem += atual.getM().getNome() +  " -> ";
						atual = atual.getProx();
			}
		}
			
		return mensagem;
	}
	
	public String imprimirPaciente() {
		String mensagem = "";
		
		if (this.vazioM()) {
			mensagem = "Lista vazia!";
		} else {
			FilaP atual = this.primPaciente;
			while (atual != null) {
				mensagem += atual.getP().getNome() + " * Senha: " + atual.getP().getNumSenha() + " -> ";
						atual = atual.getProx();
			}
		}
			
		return mensagem;
	}
	
	public void grauPrior(int grau1, int grau2, int grau3, int grau4) {
		int aux = 0;
		
		if (grau1 == 1)
			aux++;
		if (grau2 == 1)
			aux++;
		if (grau3 == 1)
			aux++;
		if (grau4 == 1)
			aux++;
		if (aux == 4)
			setPrior(1);
		else if (aux == 3)
			setPrior(2);
		else if (aux == 2)
			setPrior(3);
		else if (aux == 1)
			setPrior(4);
	}

}
