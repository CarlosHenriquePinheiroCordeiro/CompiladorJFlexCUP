package objetos;

/**
 * Retorna o tipo de c�digo que est� sendo gerado. Ou seja, se � uma declara��o de vari�vel, atribui��o, e afins
 * @author Carlos Henrique Pinheiro Cordeiro
 *
 */
public abstract class TipoCodigo {

	public static final int PROGRAM 	= 0;
	public static final int BLOCO 		= 1;
	public static final int DECLARACAO 	= 2;
	public static final int EXPRESSAO  	= 3;
	public static final int ATRIBUICAO 	= 4;
	public static final int TERMO 		= 5;
	public static final int ESTRUTURA  	= 6;
	
	
}
