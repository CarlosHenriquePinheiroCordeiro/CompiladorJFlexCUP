package objetos;
import java.util.ArrayList;

public class Programa {

	private ArrayList<Comando> listaComandos;
	private ArrayList<Funcao>  listaFuncoes;
	
	public Programa(ArrayList<Comando> comandos, ArrayList<Funcao> funcoes) {
		this.listaComandos = comandos;
		this.listaFuncoes  = funcoes;
	}


}
