
public class MainSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// invocación al método suma 
		int a = MainSuma.suma(6, 3);
		// imprime 9 
		System.out.println(a);
		// imprime 5
		System.out.println(MainSuma.suma(1, 4));
		// invocación al método resta 
		int b = MainSuma.resta(5, 3);
		// imprime 2 
		System.out.println(b);
		//imprime 3
		System.out.println(MainSuma.resta(7, 4));
		//Métodos que ya existen en JAVA
		System.out.println(Math.random()*100000);
		System.out.println(Math.min(1,2));
		System.out.println(Math.max(1,2));


	}
	public static int suma(int x, int y) {
		return x + y;
	}
	public static int resta(int z, int w) {
		return z - w;
	}
}
