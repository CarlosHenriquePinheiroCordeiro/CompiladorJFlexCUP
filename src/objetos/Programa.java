package objetos;
import java.util.ArrayList;

/**
 * Classe que representa o programa como um todo
 * @author Carlos Henrique Pinheiro Cordeiro
 *
 */
public class Programa implements Codigo {

	/** Identificador do programa */
	private Object id;
	
	/** Lista de par�metros do programa */
	private ArrayList<Var> parametros;
	
	/** Bloco de execu��o do programa */
	private Bloco bloco;
	
	/**
	 * Construtor que inicia o programa
	 * @param id identificador do programa
	 * @param parametros par�metros do programa
	 * @param bloco bloco de execu��o do programa
	 */
	public Programa(Object id, ArrayList<Var> parametros, Bloco bloco) {
		this.id = id;
		this.parametros = parametros;
		this.bloco = bloco;
		geraCodigo();
	}

	@Override
	public String geraCodigo() {
		GeraCodigo gerador = new GeraCodigo(this);
		gerador.gerarCodigo();
		return null;
	}

	public Object getId() {
		return id;
	}

	public void setId(Object id) {
		this.id = id;
	}

	public ArrayList<Var> getParametros() {
		return parametros;
	}

	public void setParametros(ArrayList<Var> parametros) {
		this.parametros = parametros;
	}

	public Bloco getBloco() {
		return bloco;
	}

	public void setBloco(Bloco bloco) {
		this.bloco = bloco;
	}
	
	@Override
	public int getTipoCodigo() {
		return TipoCodigo.PROGRAM;
	}


}
