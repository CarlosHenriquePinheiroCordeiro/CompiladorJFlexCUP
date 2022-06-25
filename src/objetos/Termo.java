package objetos;

public class Termo implements Codigo {
	
	private Object termo;
	
	public Termo(Object termo) {
		setTermo(termo);
	}

	public Object getTermo() {
		return termo;
	}

	public void setTermo(Object termo) {
		this.termo = termo;
	}

	@Override
	public String geraCodigo() {
		System.out.println("TERMO");
		return null;
	}
	

}
