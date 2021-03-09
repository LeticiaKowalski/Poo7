package atendimento;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Classificacao c = new Classificacao();
		Paciente p;
		Medicos m;
		
		// Pacientes
		p = new Paciente();
		p.setNome("Miguel");
		p.setCpf("400.400.400 - 00");
		p.setNumSenha(5);
		c.inserirPaciente(p);
		
		p = new Paciente();
		p.setNome("Flora");
		p.setCpf("500.500.500 - 00");
		p.setNumSenha(8);
		c.inserirPaciente(p);
		
		// Médicos
		m = new Medicos();
		m.setNome("Ana Lúcia");
		m.setCpf("200.200.200 - 00");
		m.setCrm(2020);
		c.inserirMedico(m);
		
		m = new Medicos();
		m.setNome("Solara");
		m.setCpf("300.300.300 - 00");
		m.setCrm(3030);
		c.inserirMedico(m);
		
		
		int aux = 0;
		do {
			System.out.println("\n* Deseja ver a lista dos pacientes(1) ou dos médicos(2)?");
			entrada = new Scanner(System.in);
			int opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println(c.imprimirPaciente());
				break;
			case 2:
				System.out.println(c.imprimirMedico());
				break;
			default:
				aux = 1;
				break;
			}
		} while (aux != 1);
	}
	
}
