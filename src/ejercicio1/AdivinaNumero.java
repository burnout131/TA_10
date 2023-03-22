package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinaNumero {
	private int numeroAleatorio;
	private int intentos;

	public AdivinaNumero(int num) {
		this.numeroAleatorio = num;
		this.intentos = 0;
	}

	/**
	 * Método que gestiona el número introducido por el usuario, la cantidad de
	 * intentos y lo que ocurre si el usuario acierta, si falla o si introduce algo
	 * que no es un número
	 */
	public void adivinar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Adivina el numero");

		do {
			try {
				System.out.println("Introduce un número entre 1 y 500:");
				int numeroIntroducido = scan.nextInt();
				this.intentos++;

				if (numeroIntroducido == this.numeroAleatorio) {
					System.out.println("Enhorabuena!! El numero era el " + this.numeroAleatorio);
					System.out.println("Has adivinado el número en " + this.intentos + " intentos");
					scan.close();
					System.exit(0);
				} else if (numeroIntroducido < this.numeroAleatorio) {
					System.out.println("El número que tienes que adivinar es mayor que " + numeroIntroducido);
				} else {
					System.out.println("El número que tienes que adivinar es menor que " + numeroIntroducido);
				}

			} catch (InputMismatchException e) {
				System.out.print("NO HAS INTRODUCIDO UN NÚMERO! \n");
				scan.next();
			}
		} while (true);

	}
}
