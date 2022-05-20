package objetos;

import java.util.ArrayList;

public class Bloco {
	
	/** Vari�veis declaradas dentro do programa */
	private ArrayList<Var> variaveis;
	
	/** Express�es do bloco de execu��o */
	private ArrayList<Expressao> expressoes;

	/** Estruturas do bloco de execu��o (por exemplo um "if") */
	private ArrayList<Estrutura> estruturas;

	/** Fun��es que foram declaradas dentro do bloco de execu��o */
	private ArrayList<Funcao> funcoes;

	/**
	 * Construtor que inicializa o bloco de execu��o
	 * @param expressoes lista de express�es do bloco de execu��o
	 * @param estruturas lista de estruturas do bloco de execu��o
	 * @param funcoes lista de fun��es do bloco de execu��o
	 */
	public Bloco(ArrayList<Expressao> expressoes, ArrayList<Estrutura> estruturas, ArrayList<Funcao> funcoes) {
		this.expressoes = expressoes;
		this.estruturas = estruturas;
		this.funcoes = funcoes;
		System.out.println("EXPRESSAO: "+expressoes);
	}


}
