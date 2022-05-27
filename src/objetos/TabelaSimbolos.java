package objetos;

import java.util.Stack;
import java.util.Hashtable;

public class TabelaSimbolos {

	private Stack<Hashtable<Object, Simbolo>> tabela = new Stack<Hashtable<Object, Simbolo>>();

	/**
	 * Retorna a tabela de s�mbolos
	 * @return tabela de s�mbolos
	 */
	public Stack<Hashtable<Object, Simbolo>> getTabela() {
		return tabela;
	}

	/**
	 * Atribui o valor para o simbolo desejado
	 * @param simbolo
	 * @param valor
	 * @return
	 */
	public boolean atribuiValor(Object simbolo, Object valor) {
		if (existeSimbolo(simbolo)) {
			
		}
		return true;
	}

	/**
	 * Adiciona um novo s�mbolo para a tabela
	 * @param simbolo
	 */
	public boolean novoSimbolo(Object simbolo, Object tipo) {
		if (!existeSimbolo(simbolo)) {
			addSimbolo(simbolo, new Simbolo(tipo));
			
		}
		return true;
	}

	/**
	 * Adiciona um novo simbolo ao escopo atual
	 * @param chaveSimbolo
	 * @param simbolo
	 */
	public void addSimbolo(Object chaveSimbolo, Simbolo simbolo) {
		getTabela().peek().put(chaveSimbolo, simbolo);
	}

	/**
	 * Retorna se o s�mbolo passado como par�metro j� existe na tabela
	 * @param simbolo
	 * @return True = existe, False = n�o existe
	 */
	public boolean existeSimbolo(Object simbolo) {
		return getTabela().peek().containsKey(simbolo);
	}

	/**
	 * Adiciona um novo escopo para a tabela de s�mbolos
	 */
	public void novoEscopo() {
		getTabela().push(new Hashtable<Object, Simbolo>());
	}

	/**
	 * Remove o escopo atual da tabela de s�mbolos
	 */
	public void fimEscopo() {
		getTabela().pop();
	}


}
