package compilador;

public class Excecao {

	/**
	 * Erro referente � um erro sint�tico na escrita do c�digo
	 * @param tipoToken
	 * @param token
	 * @param linha
	 * @param coluna
	 */
	public static void erroSintatico(String tipoToken, Object token, int linha, int coluna) {
		throw new RuntimeException("Erro de sintaxe. Linha: "+linha+". Coluna: " +coluna + "\nFoi encontrado um: "+tipoToken+" ("+token+").");
	}
	
	/**
	 * Erro referente � atribui��o de valor ao tipo errado de vari�vel
	 * @param tipoValor
	 * @param tipoVariavel
	 * @return
	 */
	public static RuntimeException tipoAtribuicao(int tipoValor, int tipoVariavel) {
		return new RuntimeException("Erro Sem�ntico: N�o � poss�vel atribuir valores do tipo "+sym.terminalNames[tipoValor]+" para vari�veis "+sym.terminalNames[tipoVariavel]+".");
	}
	
	/**
	 * Erro referente � tentativa de utilizar vari�vel n�o declarada
	 * @param variavel
	 * @return
	 */
	public static RuntimeException variavelNaoDeclarada(Object variavel) {
		return new RuntimeException("Erro Sem�ntico: Vari�vel "+variavel+" n�o declarada.");
	}

	/**
	 * Erro referente � tentativa de se declarar uma vari�vel que j� foi declarada
	 * @param variavel
	 * @return
	 */
	public static RuntimeException variavelDeclarada(Object variavel) {
		return new RuntimeException("Erro Sem�ntico: Vari�vel "+variavel+" j� foi declarada e est� se tentando declar�-la novamente.");
	}
	
	/**
	 * 
	 * @param tipoExpressao
	 * @param tipoErrado
	 * @return
	 */
	public static RuntimeException tipoExpressao(int tipoExpressao, int tipoErrado) {
		return new RuntimeException("Erro Sem�ntico: Est� tentando adicionar um termo "+sym.terminalNames[tipoErrado]+" a uma expressao de tipo "+sym.terminalNames[tipoExpressao]+". Insira apenas termos do tipo "+sym.terminalNames[tipoExpressao]+".");
	}
	
	/**
	 * 
	 * @param operador
	 * @return
	 */
	public static RuntimeException operadorInvalidoConcatenacao(Object operador) {
		return new RuntimeException("Erro Sem�ntico: Operador inv�lido para concatena��o de Strings ("+operador+").");
	}


}
