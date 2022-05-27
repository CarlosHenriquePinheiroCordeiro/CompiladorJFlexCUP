package objetos;

public class Expressao {

	private Object    termo;
	private Object    operador;
	private Expressao expressao;

	public Expressao(Object termo) {
		setTermo(termo);
	}
	
	public Expressao(Object termo, Object operador, Expressao expressao) {
		setTermo(termo);
		setOperador(operador);
		setExpressao(expressao);
	}

	public Object getTermo() {
		return termo;
	}

	public void setTermo(Object termo) {
		this.termo = termo;
	}

	public Object getOperador() {
		return operador;
	}

	public void setOperador(Object operador) {
		this.operador = operador;
	}

	public Expressao getExpressao() {
		return expressao;
	}

	public void setExpressao(Expressao expressao) {
		this.expressao = expressao;
	}


}
