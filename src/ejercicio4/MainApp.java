package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcion;

		try {
			System.out.println("Introduce la operación que quieres realizar:");
			System.out.println("1. Suma 2. Resta 3. Multiplicación 4. Potencia\n "
					+ "5. Raíz cuadrada 6. Raíz cúbica 7. División 8. Salir");

			opcion = scan.nextInt();
			Calculadora calc = new Calculadora(scan, opcion);
		} catch (InputMismatchException e) {
			//Este mensaje se mostrará si se introduce algo que no es un número
			System.out.println("NO HAS INTRODUCIDO UN NÚMERO");
		}
		scan.close();
	}

}
