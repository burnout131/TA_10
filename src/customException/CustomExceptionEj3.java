package customException;

public class CustomExceptionEj3 extends Exception {
	private int numero;

	public CustomExceptionEj3(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public String getMessage() {
		if (numero % 2 == 0) {
			return "Es par";
		} else {
			return "Es impar";
		}
	}

}
