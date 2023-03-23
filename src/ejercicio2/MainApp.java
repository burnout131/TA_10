package ejercicio2;

import customException.CustomException;

public class MainApp {

	public static void main(String[] args) {
		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new CustomException("ESTO ES UNA EXCEPTION");
		} catch (CustomException e) {
			System.out.println("Excepcion capturada con mensaje: " + e.getMessage());
		} finally {
			System.out.println("Programa terminado");
		}
	}

}
