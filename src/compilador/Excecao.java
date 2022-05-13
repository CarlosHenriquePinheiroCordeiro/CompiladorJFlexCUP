package compilador;

public class Excecao {

	public static void erroSintatico(String tipoToken, Object token, int linha, int coluna) {
		throw new RuntimeException("Erro de sintaxe. Linha: "+linha+". Coluna: " +coluna + "\nFoi encontrado um: "+tipoToken+" ("+token+").");
	}
	
	
}
