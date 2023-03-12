
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hola yonetzi");
		System.out.println(3+2);
		System.out.printf("5*2= %d", 5*2).println();
		System.out.printf("%d %d %d", 5,7,6).println();
		System.out.printf("%d * %d = %d", 5,7,5*7).println();
		
		
		//tipo de variables: int (numero sin parte decimal)
		// nombre de la variable: a 
		// valor de la variable: 10
		
		int a = 10;
		
		//el valor de la variable puede mostrarse mediante System.out.prinln
		System.out.printf("Muestra el valor de a: %d", a).println();
		
		// variables declaradas correctamente
			int E378a = 3;
			int A3d = 3;
			int asDas_d$ = 4;
			
		// error porque ya se ha definido una variable con este nombre
		// int E378a = 3;
			
		// error porque no se puede utilizar el carácter - en el nombre de una variable
		// int a-3 = 3;
			
		// error porque el nombre de una variable debe comenzar por una letra
		// int 4a = 3;
			
		// error porque el nombre de la variable no puede coincidir con palabras reservadas dellenguaje Java (en este caso, int)
		// int int a;
		
			int d = 5;
			int e = d;
			int f = d + e;
			System.out.printf("%d + %d = %d", d, e, f).println();
			
			int hola = 1, mundo = 2, bussines = 1;
			
			//Ejercicio: escribe un programa que declare tres variables de nombre a, b y c, con valoresde tipo entero. 
			// A continuación:
			//	1. Escribe una sentencia que muestre por pantalla la suma de las tres variablesutilizando System.out.println.
			//	2. Cambia el valor de la variable c.3.
			// Escribe de nuevo una sentencia que muestre por pantalla la suma de las tresvariables utilizando System.out.printf
			
			int r = 10;
			int m = 11;
			int j = 12;
			
			System.out.printf("%d + %d + %d = %d" ,r,m,j,r+m+j).println();
	}

}
