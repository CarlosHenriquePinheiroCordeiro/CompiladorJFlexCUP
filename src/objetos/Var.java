package objetos;

/**
 * Classe que representa o objeto Var (declaração de variável)
 * @author Carlos Henrique Pinheiro Cordeiro
 *
 */
public class Var implements Codigo {

	/** Tipo da variável */
	private Object tipo;

	/** Identificador da variável */
	private Object id;

	public Var() {}
	
	/**
	 * Construtor que inicializa a variável
	 * @param tipo tipo da variável
	 * @param id identificador da variável
	 */
	public Var(Object id, Object tipo) {
		this.tipo = tipo;
		this.id = id;
	}

	public Object getTipo() {
		return tipo;
	}

	public void setTipo(Object tipo) {
		this.tipo = tipo;
	}

	public Object getId() {
		return id;
	}

	public void setId(Object id) {
		this.id = id;
	}

	@Override
	public String geraCodigo() {
		System.out.println("VAR");
		return "";
	}
	
	@Override
	public int getTipoCodigo() {
		return TipoCodigo.DECLARACAO;
	}


}
