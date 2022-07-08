package objetos;

import java.util.ArrayList;

public class Bloco implements Codigo {
	
	private ArrayList<Codigo> linhas = new ArrayList<Codigo>();

	public Bloco() {}
	
	/**
	 * Adiciona a linha atual ao bloco
	 * @param linha
	 */
	public void addLinha(Codigo linha) {
		getLinhas().add(linha);
	}
	
	/**
	 * Continua a adição das linhas para o bloco atual
	 * @param linhasBloco
	 */
	public void addLinhasBloco(Bloco bloco) {
		if (bloco != null) {
			for (Codigo linhaBloco : bloco.getLinhas()) {
				getLinhas().add(linhaBloco);
			}
		}
	}

	public ArrayList<Codigo> getLinhas() {
		return linhas;
	}

	public void setLinhas(ArrayList<Codigo> linhas) {
		this.linhas = linhas;
	}

	@Override
	public String geraCodigo() {
		String codigo = "";
		for (Codigo linha : getLinhas()) {
			codigo += linha.geraCodigo();
		}
		return codigo;
	}
	
	@Override
	public int getTipoCodigo() {
		return TipoCodigo.BLOCO;
	}


}
