package objetos;

public class Atribuicao {
	
	/** Alvo da atribui��o, que vai receber o resultado */
	private Object alvo;
	
	/** Operador da atribui��o */
	private Object operadorAtribuicao;
	
	/** Valor da atribui��o */
	private Expressao valor;
	
	public Atribuicao() {}
	
	/**
	 * Construtor que instancia a Atribui��o com seus atributos
	 * @param alvo Alvo da atribui��o
	 * @param operadorAtribuicao Operador da atribui��o
	 * @param valor Valor da atribui��o
	 */
	public Atribuicao(Object alvo, Object operadorAtribuicao, Expressao valor) {
		this.alvo = alvo;
		this.operadorAtribuicao = operadorAtribuicao;
		this.valor = valor;
	}


}
