package atendimento;

public class FilaM {
	
	private Medicos m;
	private FilaM prox;
	
	
	public FilaM() {
		
	}
	
	public FilaM(Medicos m) {
		this.m = m;
		this.prox = null;
	}
	
	
	public Medicos getM() {
		return m;
	}
	
	public void setM(Medicos m) {
		this.m = m;
	}
	
	public FilaM getProx() {
		return prox;
	}
	
	public void setProx(FilaM prox) {
		this.prox = prox;
	}
	
}
