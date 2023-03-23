package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcion;

		try {
			System.out.println("Introduce la operaci�n que quieres realizar:");
			System.out.println("1. Suma 2. Resta 3. Multiplicaci�n 4. Potencia\n "
					+ "5. Ra�z cuadrada 6. Ra�z c�bica 7. Divisi�n 8. Salir");

			opcion = scan.nextInt();
			Calculadora calc = new Calculadora(scan, opcion);
		} catch (InputMismatchException e) {
			//Este mensaje se mostrar� si se introduce algo que no es un n�mero
			System.out.println("NO HAS INTRODUCIDO UN N�MERO");
		}
		scan.close();
	}

}
