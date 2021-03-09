package atendimento;

public class FilaP {
	
	private Paciente p;
	private FilaP prox;
	
	
	public FilaP() {
		
	}
	
	public FilaP(Paciente p) {
		this.p = p;
		this.prox = null;
	}
	
	
	public Paciente getP() {
		return p;
	}
	
	public void setP(Paciente p) {
		this.p = p;
	}
	
	public FilaP getProx() {
		return prox;
	}
	
	public void setProx(FilaP prox) {
		this.prox = prox;
	}
	
}
