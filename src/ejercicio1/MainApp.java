package ejercicio1;

public class MainApp {

	public static void main(String[] args) {
		//Generamos el número mediante Math.random
		int numeroAleatorio = (int) (Math.random() * 500) + 1;
		//Creamos un objeto AdivinaNumero y le pasamos por parámetro el numero aleatorio
		AdivinaNumero generarNumeros = new AdivinaNumero(numeroAleatorio);
		//Ejecutamos el método adivinar, que hará el resto
		generarNumeros.adivinar();
	}

}
