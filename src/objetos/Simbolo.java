package objetos;

public class Simbolo {
	
	/** Tipo do Símbolo */
	private Object tipo;
	
	/** Valor do Símbolo */
	private Object valor;
	
	/** Indica se o Símbolo foi usado ou não */
	private boolean usado = false;

	public Simbolo() {}
	
	public Simbolo(Object tipo) {
		setTipo(tipo);
	}
	
	public Simbolo(Object tipo, Object valor) {
		setTipo(tipo);
		setValor(valor);
	}
	
	public Object getTipo() {
		return tipo;
	}

	public void setTipo(Object tipo) {
		this.tipo = tipo;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}

	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}


}