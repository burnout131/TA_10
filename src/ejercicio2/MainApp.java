package ejercicio2;

import customException.CustomExceptionEj2;

public class MainApp {

	public static void main(String[] args) {
		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new CustomExceptionEj2("ESTO ES UNA EXCEPTION");
		} catch (CustomExceptionEj2 e) {
			System.out.println("Excepcion capturada con mensaje: " + e.getMessage());
		} finally {
			System.out.println("Programa terminado");
		}
	}

}
