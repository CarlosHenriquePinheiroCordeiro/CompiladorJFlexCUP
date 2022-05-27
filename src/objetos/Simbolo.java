package objetos;

public class Simbolo {

	private Object tipo;
	private Object valor;

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


}
