package objetos;

import java.util.Stack;

import compilador.Excecoes;
import compilador.sym;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TabelaSimbolos {

	private Stack<Hashtable<Object, Simbolo>> tabela = new Stack<Hashtable<Object, Simbolo>>();

	private final String INTEGER_REGEX = "0|[1-9][0-9]*";
	private final String FLOAT_REGEX   = "(0|[1-9][0-9]*)\\.?[0-9]*";
	private final String STRING_REGEX  = "\".*\"";
	private final String BOOLEAN_REGEX = "true|false";
	
	/**
	 * Retorna a tabela de símbolos
	 * @return tabela de símbolos
	 */
	public Stack<Hashtable<Object, Simbolo>> getTabela() {
		return this.tabela;
	}

	/**
	 * Atribui o valor para o simbolo desejado
	 * @param simbolo
	 * @param valor
	 * @return
	 */
	public boolean atribuiValor(Object simbolo, Object valor) {
		if (existeSimbolo(simbolo)) {
			Simbolo variavel = getSimbolo(simbolo);
			int tipoValor = getTipoValor(valor);
			if ((Integer)variavel.getTipo() == tipoValor) {
				return true;
			}
			throw Excecoes.tipoAtribuicao(tipoValor, (Integer)variavel.getTipo());
		}
		throw Excecoes.variavelNaoDeclarada(simbolo);
	}
	
	/**
	 * Retorna o tipo do valor em uma atribuição
	 * @param valor
	 * @return Código do tipo do valor
	 */
	public int getTipoValor(Object valor) {
		if (String.valueOf(valor).matches(INTEGER_REGEX)) {
			return sym.INT;
		}
		if (String.valueOf(valor).matches(FLOAT_REGEX)) {
			return sym.FLOAT;
		}
		if (String.valueOf(valor).matches(BOOLEAN_REGEX)) {
			return sym.BOOL;
		}
		if (valor.getClass() == StringBuffer.class) {
			return sym.STRING;
		}
		
		return (Integer)getSimbolo(valor).getTipo();
	}

	/**
	 * Adiciona um novo símbolo para a tabela
	 * @param simbolo
	 */
	public boolean novoSimbolo(Object simbolo, Object tipo) {
		if (!existeSimbolo(simbolo)) {
			addSimbolo(simbolo, new Simbolo(tipo));
			return true;
		}
		throw Excecoes.variavelDeclarada(simbolo);
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
	 * Retorna se o símbolo passado como parâmetro já existe na tabela
	 * @param simbolo
	 * @return True = existe, False = não existe
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
	 * Procura um símbolo na tabela e o retorna
	 * @param simbolo
	 * @return Símbolo encontrado
	 */
	public Simbolo getSimbolo(Object simbolo) {
		Simbolo Simbolo = null;
		for (int i = 0; i < getTabela().size(); i++) {
			if (getTabela().get(i).containsKey(simbolo)) {
				Simbolo = getTabela().get(i).get(simbolo);
				break;
			}
		}
		return Simbolo;
	}

	/**
	 * Adiciona um novo escopo para a tabela de símbolos
	 */
	public void novoEscopo() {
		getTabela().push(new Hashtable<Object, Simbolo>());
	}

	/**
	 * Remove o escopo atual da tabela de símbolos
	 */
	public void fimEscopo() {
		verificaSimbolosNaoUtilizados();
		getTabela().pop();
	}
	
	/**
	 * Verifica os símbolos que não foram utilizados
	 */
	public void verificaSimbolosNaoUtilizados() {
		getTabela().peek().forEach((k, v) -> {
			if (!v.isUsado()) {
				System.out.println("Aviso: Variável "+k+" declarada mas não utilizada.");
			}
		});
	}
	
	/**
	 * Verifica se um símbolo está sendo utilizado. Se for o caso, marca como utilizado
	 * @param termo
	 */
	public void verificaUsaSimbolo(Object termo) {
		if (existeSimbolo(termo)) {
			getSimbolo(termo).setUsado(true);
		} else {
			throw Excecoes.variavelNaoDeclarada(termo);
		}
	}


}
