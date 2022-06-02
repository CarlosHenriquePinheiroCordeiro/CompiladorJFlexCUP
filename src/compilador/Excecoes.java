package compilador;

public class Excecoes {

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


}
