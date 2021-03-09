package atendimento;

import java.util.Date;

public class ConsultaMedica extends Classificacao{
	
	private Date inicio;
	private Date fim;
	
	
	public ConsultaMedica() {
		this.inicio = null;
		this.fim = null;
	}
	
	
	public Date getInicio() {
		return inicio;
	}
	
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	
	public Date getFim() {
		return fim;
	}
	
	public void setFim(Date fim) {
		this.fim = fim;
	}
	
	
	public Date tempo() {
		return fim;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n- CONSULTA -");
		builder.append("\n* Início da fila: ");
		builder.append(inicio);
		builder.append("\n* Fim da fila: ");
		builder.append(fim);
		builder.append(super.toString());
		return builder.toString();
	}
}
