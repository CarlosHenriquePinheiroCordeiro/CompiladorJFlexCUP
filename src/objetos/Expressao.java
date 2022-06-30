package objetos;

public class Expressao implements Codigo {

	private Object    termo;
	private Object    operador;
	private Expressao expressao = null;

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
	
	public boolean validaExpressao() {
		return true;
	}

	@Override
	public String geraCodigo() {
		System.out.println("EXPRESSAO");
		return null;
	}
	
	@Override
	public int getTipoCodigo() {
		return TipoCodigo.EXPRESSAO;
	}


}
