package objetos;
import java.util.ArrayList;

/**
 * Classe que representa o programa como um todo
 * @author Carlos Henrique Pinheiro Cordeiro
 *
 */
public class Programa {

	/** Identificador do programa */
	private Object id;
	
	/** Lista de parâmetros do programa */
	private ArrayList<Var> parametros;
	
	/** Bloco de execução do programa */
	private Bloco bloco;
	
	/**
	 * Construtor que inicia o programa
	 * @param id identificador do programa
	 * @param parametros parâmetros do programa
	 * @param bloco bloco de execução do programa
	 */
	public Programa(Object id, ArrayList<Var> parametros, Bloco bloco) {
		this.id = id;
		this.parametros = parametros;
		this.bloco = bloco;
	}


}
