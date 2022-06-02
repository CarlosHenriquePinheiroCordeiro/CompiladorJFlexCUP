package compilador;

public class Excecoes {

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


}
