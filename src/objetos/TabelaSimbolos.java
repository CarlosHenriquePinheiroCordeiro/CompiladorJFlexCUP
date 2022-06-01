package objetos;

import java.util.Stack;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TabelaSimbolos {

	private Stack<Hashtable<Object, Simbolo>> tabela = new Stack<Hashtable<Object, Simbolo>>();
	private int escopo = 0;
	
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
			return true;
		}
		throw new RuntimeException("Erro Sem�ntico: Vari�vel "+simbolo+" n�o declarada");
	}

	/**
	 * Adiciona um novo s�mbolo para a tabela
	 * @param simbolo
	 */
	public boolean novoSimbolo(Object simbolo, Object tipo) {
		if (!existeSimbolo(simbolo)) {
			addSimbolo(simbolo, new Simbolo(tipo));
			return true;
		}
		throw new RuntimeException("Erro Sem�ntico: Vari�vel "+simbolo+" j� foi declarada e est� se tentando declar�-la novamente.");
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
		for (int i = 0; i < getTabela().size(); i++) {
			if (getTabela().get(i).containsKey(simbolo)) {
				return true;
			}
		}
		return false;
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
		verificaSimbolosNaoUtilizados();
		getTabela().pop();
	}
	
	public void verificaSimbolosNaoUtilizados() {
		getTabela().peek().forEach((k, v) -> {
			if (!v.isUsado()) {
				System.out.println("Aviso: Vari�vel "+k+" declarada mas n�o utilizada.");
			}
		});
	}
	
	public void verificaUsaSimbolo(Object termo) {
		if (isVariavel(termo)) {
			if (existeSimbolo(termo)) {
				
			} else {
				throw new RuntimeException("Erro Sem�ntico: Vari�vel  "+termo+" n�o declarada.");
			}
		}
	}
	
	public boolean isVariavel(Object termo) {
		return true;
	}


}
