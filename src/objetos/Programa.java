package objetos;
import java.util.ArrayList;

/**
 * Classe que representa o programa como um todo
 * @author Carlos Henrique Pinheiro Cordeiro
 *
 */
public class Programa {

	/** Lista de parâmetros do programa */
	private ArrayList<Var> parametros;
	
	/** Bloco de execução do programa */
	private Bloco bloco;
	
	/**
	 * Construtor que inicia o programa
	 * @param parametros parâmetros do programa
	 * @param bloco bloco de execução do programa
	 */
	public Programa(ArrayList<Var> parametros, Bloco bloco) {
		this.parametros = parametros;
		this.bloco = bloco;
		System.out.println("LISTA_VAR: "+parametros);
		System.out.println("BLOCO: "+bloco);
	}


}
