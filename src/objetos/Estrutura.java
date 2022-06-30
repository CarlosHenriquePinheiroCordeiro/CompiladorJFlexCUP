package objetos;

public class Estrutura implements Codigo {

	private Expressao condicao;
	private Bloco bloco;
	
	public Estrutura(Expressao condicao, Bloco bloco) {
		setCondicao(condicao);
		setBloco(bloco);
	}
	
	public Expressao getCondicao() {
		return condicao;
	}

	public void setCondicao(Expressao condicao) {
		this.condicao = condicao;
	}

	public Bloco getBloco() {
		return bloco;
	}

	public void setBloco(Bloco bloco) {
		this.bloco = bloco;
	}

	@Override
	public String geraCodigo() {
		System.out.println("ESTRUTURA");
		getBloco().geraCodigo();
		return null;
	}
	
	@Override
	public int getTipoCodigo() {
		return TipoCodigo.ESTRUTURA;
	}

}
