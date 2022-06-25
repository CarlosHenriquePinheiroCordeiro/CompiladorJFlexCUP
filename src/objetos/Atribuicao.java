package objetos;

public class Atribuicao implements Codigo{
	
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
		this.alvo               = alvo;
		this.operadorAtribuicao = operadorAtribuicao;
		this.valor 				= valor;
	}

	public Object getAlvo() {
		return alvo;
	}

	public void setAlvo(Object alvo) {
		this.alvo = alvo;
	}

	public Object getOperadorAtribuicao() {
		return operadorAtribuicao;
	}

	public void setOperadorAtribuicao(Object operadorAtribuicao) {
		this.operadorAtribuicao = operadorAtribuicao;
	}

	public Expressao getValor() {
		return valor;
	}

	public void setValor(Expressao valor) {
		this.valor = valor;
	}

	@Override
	public String geraCodigo() {
		System.out.println("ATRIBUICAO");
		return null;
	}


}
