package EXAMEN3;

public class EJ5 {

	public static void main(String[] args) {
		int num1 = 170;
		int num2 = 28;
		int num3 = 39;
		int num4 = 40;

		int mayor = Math.max(Math.max(num1, num2), Math.max(num3, num4));

		System.out.println("El mayor número es: " + mayor);
	}

}
