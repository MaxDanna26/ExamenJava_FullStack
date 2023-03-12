import java.util.Scanner;

public class ejercicioBanco {
	public static void method( String stringms ) {
		System.out.println(stringms);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Ejercicio proyecto (Main4): reutiliza el programa desarrollado para mostrar los mensajes(Gestores, Clientes, Transferencias, Mensajes, Préstamos) en métodos (un método porcada mensaje).
		
		String[] resps = { "Gestores", "Clientes", "Transferencias", "Mensajes", "Préstamos", "Salir" };
		boolean online = true;

		while (online) {
			System.out.println(
					"\n---\n1. Gestores\n2. Clientes\n3. Transferencias\n4. Mensajes\n5. Préstamos\n6. Salir\n---");

			Scanner keyboard = new Scanner(System.in);
			System.out.printf("Decime un numero: ", keyboard);

			int numero = keyboard.nextInt();

			if (numero > resps.length  || numero < 1) {
				System.out.printf("Decime otro numero: ", keyboard);
				numero = keyboard.nextInt();
			}

			if (numero < resps.length && numero > 0) {
			
				ejercicioBanco.method(resps[numero - 1]);
			}

			if (numero == resps.length) {
				keyboard.close();
				online = false;
				System.out.println("Fin del programa");
			}
		}
	}
}
