package ejercicio4;

import java.util.Scanner;

import customException.CustomException;

public class Calculadora {
	private int opcionSeleccionada;

	public Calculadora(Scanner scan, int opcion) {
		this.opcionSeleccionada = opcion;
		ejecutaOperacion(scan, opcionSeleccionada);
	}

	public void ejecutaOperacion(Scanner scan, int opcion) {

		try {

			while (true) {
				double num1, num2;

				switch (opcion) {
				case 1:
					System.out.println("Introduce el primer número");
					num1 = scan.nextDouble();
					System.out.println("Introduce el segundo número");
					num2 = scan.nextDouble();
					System.out.println("SUMA --> " + num1 + " + " + num2 + " = " + (num1 + num2));
					break;
				case 2:
					System.out.println("Introduce el primer número");
					num1 = scan.nextDouble();
					System.out.println("Introduce el segundo número");
					num2 = scan.nextDouble();
					System.out.println("RESTA --> " + num1 + " - " + num2 + " = " + (num1 - num2));
					break;
				case 3:
					System.out.println("Introduce el primer número");
					num1 = scan.nextDouble();
					System.out.println("Introduce el segundo número");
					num2 = scan.nextDouble();
					System.out.println("MULTIPLICACIÓN --> " + num1 + " * " + num2 + " = " + (num1 * num2));
					break;
				case 4:
					System.out.println("Introduce el primer número");
					num1 = scan.nextDouble();
					System.out.println("Introduce el segundo número");
					num2 = scan.nextDouble();
					System.out.println("POTENCIA --> " + num1 + " ^ " + num2 + " = " + (Math.pow(num1, num2)));
					break;
				case 5:
					System.out.println("Introduce un número");
					num1 = scan.nextDouble();
					if (num1 < 0) {
						throw new CustomException("NO SE PUEDE CALCULAR LA RAIZ CUADRADA DE UN NUM. NEGATIVO");
					}
					System.out.println("RAÍZ CUADRADA --> Raíz cuadrada de " + num1 + " = " + (Math.sqrt(num1)));
					break;
				case 6:
					System.out.println("Introduce un número");
					num1 = scan.nextDouble();
					System.out.println("RAÍZ CÚBICA --> Raíz cúbica de " + num1 + " = " + (Math.cbrt(num1)));
					break;
				case 7:
					System.out.println("Introduce el primer número");
					num1 = scan.nextDouble();
					System.out.println("Introduce el segundo número");
					num2 = scan.nextDouble();
					if (num2 == 0) {
						throw new CustomException("No se puede dividir entre 0");
					}
					System.out.println("DIVISIÓN --> " + num1 + " / " + num2 + " = " + (num1 / num2));
					break;
				case 8:
					System.out.println("¡ADIÓS!");
					System.exit(0);
					break;
				default:
					//Se muestra si no se ha seleccionado una opción entre las disponibles (1-8)
					throw new CustomException("Selección de operación incorrecta.");
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
