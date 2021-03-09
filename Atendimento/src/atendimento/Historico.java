package atendimento;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	
	private List<Classificacao> laten = new ArrayList<Classificacao>();
	
	
	public boolean addHistorico(Classificacao clas) {
		return laten.add(clas);
	}
	
	public String historico() {
		String mensagem = "";
		
		for (Classificacao classificacao : laten)
			mensagem += classificacao;
		
		return mensagem;
	}
}
