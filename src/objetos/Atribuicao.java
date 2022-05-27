package objetos;

public class Atribuicao {
	
	/** Alvo da atribuição, que vai receber o resultado */
	private Object alvo;
	
	/** Operador da atribuição */
	private Object operadorAtribuicao;
	
	/** Valor da atribuição */
	private Expressao valor;
	
	public Atribuicao() {}
	
	/**
	 * Construtor que instancia a Atribuição com seus atributos
	 * @param alvo Alvo da atribuição
	 * @param operadorAtribuicao Operador da atribuição
	 * @param valor Valor da atribuição
	 */
	public Atribuicao(Object alvo, Object operadorAtribuicao, Expressao valor) {
		this.alvo = alvo;
		this.operadorAtribuicao = operadorAtribuicao;
		this.valor = valor;
	}


}
