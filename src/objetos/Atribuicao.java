package objetos;

public class Atribuicao implements Codigo{
	
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
	public Atribuicao(Object alvo, String operadorAtribuicao, Expressao valor) {
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
		String codigo = "";
		if (getValor().getOperador() == null) 
			codigo = geraCodigoAtribuicaoSimples();
		else 
			codigo = geraCodigoAtribuicaoExpressao();
		return codigo;
	}
	
	/**
	 * Retorna o c�digo gerado para uma atribui��o simples, onde o resultado � apenas um termo
	 * @return
	 */
	private String geraCodigoAtribuicaoSimples() {
		String codigo = "";
		codigo += Operadores.getOperador((String)getOperadorAtribuicao())+"\t";
		codigo += (String)getAlvo()+", ";
		codigo += retornaTermoAtribuicao(getValor().getTermo());
		return codigo;
	}
	
	/**
	 * Retorna devidamente o termo para atribui��o, verificando se o termo � uma constante ou vari�vel
	 * @param termo
	 * @return
	 */
	private String retornaTermoAtribuicao(Object termo) {
		String termoExpressao = Registradores.getRegistrador((String) termo);
		if (termoExpressao == null) {
			termoExpressao = (String)termo;
		}
		return termoExpressao;
	}
	
	/**
	 * Retorna o c�digo gerado para uma atribui��o onde o resultado vem de uma express�o com mais termos
	 * @return
	 */
	private String geraCodigoAtribuicaoExpressao() {
		return "";
	}

	@Override
	public int getTipoCodigo() {
		return TipoCodigo.ATRIBUICAO;
	}


}
