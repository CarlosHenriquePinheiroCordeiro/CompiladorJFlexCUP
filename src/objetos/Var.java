package objetos;

/**
 * Classe que representa o objeto Var (declara��o de vari�vel)
 * @author Carlos Henrique Pinheiro Cordeiro
 *
 */
public class Var implements Codigo {

	/** Tipo da vari�vel */
	private Object tipo;

	/** Identificador da vari�vel */
	private Object id;

	public Var() {}
	
	/**
	 * Construtor que inicializa a vari�vel
	 * @param tipo tipo da vari�vel
	 * @param id identificador da vari�vel
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
