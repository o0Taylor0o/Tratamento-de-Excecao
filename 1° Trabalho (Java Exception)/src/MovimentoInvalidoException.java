
public class MovimentoInvalidoException extends Throwable{
	private int x;
	private int y;
	
	public MovimentoInvalidoException(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		if(x < 0) {
		return "Movimento Invalido no eixo X.";
	}else return "Movimento Invalido no eixo Y.";
	}
	
	

}


