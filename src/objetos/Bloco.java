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

	public Bloco() {}
	
	/**
	 * Construtor que inicializa o bloco de execu��o
	 * @param vari�veis do bloco de execu��o
	 * @param express�es lista de express�es do bloco de execu��o
	 * @param estruturas lista de estruturas do bloco de execu��o
	 * @param fun��es lista de fun��es do bloco de execu��o
	 */
	public Bloco(ArrayList<Var> variaveis, ArrayList<Expressao> expressoes, ArrayList<Estrutura> estruturas, ArrayList<Funcao> funcoes) {
		this.variaveis = variaveis;
		this.expressoes = expressoes;
		this.estruturas = estruturas;
		this.funcoes = funcoes;
	}

	public ArrayList<Var> getVariaveis() {
		return variaveis;
	}

	public void setVariaveis(ArrayList<Var> variaveis) {
		this.variaveis = variaveis;
	}

	public ArrayList<Expressao> getExpressoes() {
		return expressoes;
	}

	public void setExpressoes(ArrayList<Expressao> expressoes) {
		this.expressoes = expressoes;
	}

	public ArrayList<Estrutura> getEstruturas() {
		return estruturas;
	}

	public void setEstruturas(ArrayList<Estrutura> estruturas) {
		this.estruturas = estruturas;
	}

	public ArrayList<Funcao> getFuncoes() {
		return funcoes;
	}

	public void setFuncoes(ArrayList<Funcao> funcoes) {
		this.funcoes = funcoes;
	}


}
