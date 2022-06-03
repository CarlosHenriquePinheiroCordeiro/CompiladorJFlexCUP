package compilador;

public class Excecao {

	/**
	 * Erro referente à um erro sintático na escrita do código
	 * @param tipoToken
	 * @param token
	 * @param linha
	 * @param coluna
	 */
	public static void erroSintatico(String tipoToken, Object token, int linha, int coluna) {
		throw new RuntimeException("Erro de sintaxe. Linha: "+linha+". Coluna: " +coluna + "\nFoi encontrado um: "+tipoToken+" ("+token+").");
	}
	
	/**
	 * Erro referente à atribuição de valor ao tipo errado de variável
	 * @param tipoValor
	 * @param tipoVariavel
	 * @return
	 */
	public static RuntimeException tipoAtribuicao(int tipoValor, int tipoVariavel) {
		return new RuntimeException("Erro Semântico: Não é possível atribuir valores do tipo "+sym.terminalNames[tipoValor]+" para variáveis "+sym.terminalNames[tipoVariavel]+".");
	}
	
	/**
	 * Erro referente à tentativa de utilizar variável não declarada
	 * @param variavel
	 * @return
	 */
	public static RuntimeException variavelNaoDeclarada(Object variavel) {
		return new RuntimeException("Erro Semântico: Variável "+variavel+" não declarada.");
	}

	/**
	 * Erro referente à tentativa de se declarar uma variável que já foi declarada
	 * @param variavel
	 * @return
	 */
	public static RuntimeException variavelDeclarada(Object variavel) {
		return new RuntimeException("Erro Semântico: Variável "+variavel+" já foi declarada e está se tentando declará-la novamente.");
	}
	
	/**
	 * 
	 * @param tipoExpressao
	 * @param tipoErrado
	 * @return
	 */
	public static RuntimeException tipoExpressao(int tipoExpressao, int tipoErrado) {
		return new RuntimeException("Erro Semântico: Está tentando adicionar um termo "+sym.terminalNames[tipoErrado]+" a uma expressao de tipo "+sym.terminalNames[tipoExpressao]+". Insira apenas termos do tipo "+sym.terminalNames[tipoExpressao]+".");
	}
	
	/**
	 * 
	 * @param operador
	 * @return
	 */
	public static RuntimeException operadorInvalidoConcatenacao(Object operador) {
		return new RuntimeException("Erro Semântico: Operador inválido para concatenação de Strings ("+operador+").");
	}


}
