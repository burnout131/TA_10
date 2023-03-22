package ejercicio3;

import java.util.Random;

import customException.CustomExceptionEj3;

public class MainApp {

	public static void main(String[] args) {
		Random rand = new Random();
		try {
			System.out.println("Generando número aleatorio...");
			int numAleatorio = rand.nextInt(1000);
			System.out.println("El numero generado es:" + numAleatorio);
			throw new CustomExceptionEj3(numAleatorio);
		} catch (CustomExceptionEj3 e) {
			System.out.println(e.getMessage());
		}
	}

}
