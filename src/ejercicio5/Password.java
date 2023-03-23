package ejercicio5;

public class Password {
	private int longitud;
	private String password;
	final private int LONGITUD_DEFAULT = 8;

	public Password() {
		this.longitud = LONGITUD_DEFAULT;
		this.password = generaPassword(this.longitud);
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.password = generaPassword(this.longitud);
	}

	/**
	 * Genera una contraseña aleatoria con la longitud determinada por parámetro
	 * @param longitud
	 * @return Una contraseña aleatoria
	 */
	public String generaPassword(int longitud) {

		// Elegimos un caracter aleatorio del siguiente String
		String alfaNumerico = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		// Creamos un StringBuilder con la longitud establecida por parametro
		StringBuilder sb = new StringBuilder(longitud);

		for (int i = 0; i < longitud; i++) {
			// Generamos un numero entre 0 i la longitud maxima, para usarlo despues como
			// indice
			int indice = (int) (alfaNumerico.length() * Math.random());

			// Añadimos los caracteres al StringBuilder
			sb.append(alfaNumerico.charAt(indice));
		}
		return sb.toString();
	}

	/**
	 * Metodo que comprueba si la contraseña cumple los requisitos para que sea considerada fuerte
	 * @return True si la contraseña es fuerte, en caso contrario, false
	 */
	public boolean esFuerte() {
		int contadorMayus = 0;
		int contadorMinus = 0;
		int contadorNumeros = 0;

		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
				contadorMayus++;
			}
			if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
				contadorMinus++;
			}
			if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
				contadorNumeros++;
			}
		}

		if (contadorMayus > 2 && contadorMinus > 1 && contadorNumeros > 5) {
			return true;
		} else {
			return false;
		}
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}

}
