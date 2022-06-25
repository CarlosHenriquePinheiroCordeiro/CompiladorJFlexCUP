package objetos;

public class GeraCodigo {

	private Programa programa;
	
	public GeraCodigo(Programa programa) {
		setPrograma(programa);
	}
	
	public void gerarCodigo() {
		getPrograma().geraCodigo();
		//OBS: O program(...) {...} NÃO PRECISA GERAR CÓDIGO, A ÚNICA COISA
		//QUE PRECISA GERAR DELE É INSTANCIAR AS VARIÁVEIS PASSADAS 
		//COMO PARÂMETRO A PARTIR DO PROGRAM, E TAMBÉM O NOME DO program COMO LABEL
	}

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
	
	
}
