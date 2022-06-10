package objetos;

import java.util.ArrayList;

public class Bloco {
	
	private ArrayList<Object> linhas = new ArrayList<Object>();

	public Bloco() {}
	
	/**
	 * Adiciona a linha atual ao bloco
	 * @param linha
	 */
	public void addLinha(Object linha) {
		getLinhas().add(linha);
	}
	
	/**
	 * Continua a adição das linhas para o bloco atual
	 * @param linhasBloco
	 */
	public void addLinhasBloco(Bloco bloco) {
		if (bloco != null) {
			for (Object linhaBloco : bloco.getLinhas()) {
				getLinhas().add(linhaBloco);
			}
		}
	}

	public ArrayList<Object> getLinhas() {
		return linhas;
	}

	public void setLinhas(ArrayList<Object> linhas) {
		this.linhas = linhas;
	}


}
