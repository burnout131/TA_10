package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			int arrayLength, passwordLength;
			System.out.println("Introduce longitud del array: ");
			arrayLength = scan.nextInt();
			System.out.println("Introduce longitud de la contraseña: ");
			passwordLength = scan.nextInt();
			
			Password arrayPasswords[] = new Password[arrayLength];
			boolean arrayIsStrongPass[] = new boolean[arrayLength];

			for (int i = 0; i < arrayPasswords.length; i++) {
				arrayPasswords[i] = new Password(passwordLength);
				arrayIsStrongPass[i] = arrayPasswords[i].esFuerte();
				System.out.println("Contraseña " + (i + 1) + ": " + arrayPasswords[i].getPassword() + " " + arrayIsStrongPass[i]);
			}
			
		} catch (InputMismatchException e) {
			System.out.println("No has introducido una longitud válida!");
		}
		scan.close();
	}

}
