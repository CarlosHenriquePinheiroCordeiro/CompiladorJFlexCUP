package objetos;

import java.util.ArrayList;

public class Bloco {
	
	/** Variáveis declaradas dentro do programa */
	private ArrayList<Var> variaveis;
	
	/** Expressões do bloco de execução */
	private ArrayList<Expressao> expressoes;

	/** Estruturas do bloco de execução (por exemplo um "if") */
	private ArrayList<Estrutura> estruturas;

	/** Funções que foram declaradas dentro do bloco de execução */
	private ArrayList<Funcao> funcoes;

	/**
	 * Construtor que inicializa o bloco de execução
	 * @param expressoes lista de expressões do bloco de execução
	 * @param estruturas lista de estruturas do bloco de execução
	 * @param funcoes lista de funções do bloco de execução
	 */
	public Bloco(ArrayList<Expressao> expressoes, ArrayList<Estrutura> estruturas, ArrayList<Funcao> funcoes) {
		this.expressoes = expressoes;
		this.estruturas = estruturas;
		this.funcoes = funcoes;
		System.out.println("EXPRESSAO: "+expressoes);
	}


}
