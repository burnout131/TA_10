package ejercicio1;

public class MainApp {

	public static void main(String[] args) {
		//Generamos el n�mero mediante Math.random
		int numeroAleatorio = (int) (Math.random() * 500) + 1;
		//Creamos un objeto AdivinaNumero y le pasamos por par�metro el numero aleatorio
		AdivinaNumero generarNumeros = new AdivinaNumero(numeroAleatorio);
		//Ejecutamos el m�todo adivinar, que har� el resto
		generarNumeros.adivinar();
	}

}
