package atendimento;

import java.util.ArrayList;
import java.util.List;

public class FilaA {
	
	private List<Classificacao> lclas = new ArrayList<Classificacao>();
	
	
	public boolean addFila(Classificacao c) {
		return lclas.add(c);
	}
	
	public boolean foiAtendido(Classificacao c) {
		return lclas.remove(c);
	}
	
	public String mostrarFila() {
		String mensagem = "";
		
		for (Classificacao classificacao : lclas) {
			mensagem += classificacao;
		}
		
		return mensagem;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n* Fila para atendimento: ");
		builder.append(lclas);
		return builder.toString();
	}
}
