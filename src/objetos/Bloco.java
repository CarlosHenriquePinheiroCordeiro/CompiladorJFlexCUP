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

	public Bloco() {}
	
	/**
	 * Construtor que inicializa o bloco de execução
	 * @param variáveis do bloco de execução
	 * @param expressões lista de expressões do bloco de execução
	 * @param estruturas lista de estruturas do bloco de execução
	 * @param funções lista de funções do bloco de execução
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
