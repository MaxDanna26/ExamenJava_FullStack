
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hola mundo");
		//3+2 sintaxis erronea
		System.out.println(3+2); //Correcte
		System.out.printf("5*2= %d", 5*2).println();
		//Si no hay sufientes parámetro o sobran para %d
		/*System.out.printf("5*2= %d").println(); //error porque falta un 
		 * parámetro
		System.out.printf("5*2= %d", 10, 11).println(); //advertencia porque 
		sobra un parámetro
		 *
		 */
		System.out.printf("5 + 6 + 7 = %d", 5 + 6 + 7).println();
		System.out.printf("%d + %d + %d = %d", 5 , 6 , 7 , 5 + 6 + 7).println();
		//%f para los decimales, "floats"
		System.out.printf("%f + %d + %d = %f", 5.5 , 6 , 7 , 5.5 + 6.3 + 7.1)
		.println();
		/*
		Tipo Type de variable: int (número sin parte decimal) 
		Nombre de la variable: a
		Valor de la variable: 10
		*/
		int a = 10;
		// el valor de la variable puede mostrarse mediante System.out.println 
		System.out.printf("Muestra el valor de a: %d", a).println();
		// variables declaradas correctamente 
		int E378a = 3;
		int A3d = 3;
		int asDas_d$ = 4;
		// error porque ya se ha definido una variable con este nombre
		// int E378a = 3;
		// error porque no se puede utilizar el carácter - en el nombre de 
		// una variable
		// int a-3 = 3;
		// error porque el nombre de una variable debe comenzar por una letra
		// int 4a = 3;
		// error porque el nombre de la variable no puede coincidir con 
		// palabras reservadas del lenguaje Java (en este caso, int)
		// int int a
		// underscore
		int edad_de_persona = 2;
		// upper camel case
		int EdadDePersona = 3;
		// lower camel case (opción recomendada en Java) 
		int edadDePersona = 4;
		int c=10;
		System.out.println(c);
		// el valor de la variable c cambia a 11 
		c = 11;
		System.out.println(c);
		int d = 5; 
		int e = d;
		int f = d + e;
		System.out.printf("%d + %d = %d", d, e, f).println();
		// las tres variables declaradas son de tipo entero 
		int num1 = 1, num2 = 2, num3 = 86;
		System.out.printf("%d, %d y %d", num1, num2, num3).println();
		// declaración de variables que no son inicializadas 
		int provA;
		int provB;
		// error porque antes de utilizar la variable es necesario que tome algún valor
		//System.out.println(provA);
		provB = 5;
		// correcto porque a la variable b se le ha asignado previamente un valor 
		System.out.println(provB);
		// la variable a es declarada dentro del bloque del método main 
		int aScope = 5;
		// la variable b es declarada sin ningún valor dentro del bloque del método main 
		int bScope;
		// b tomará un valor siempre, independientemente del valor de a 
		if (aScope == 5) {
			bScope = 3;
		} else { 
			bScope = 4;
		}
		// ahora ya no se producirá ningún error porque b tendrá valor siempre en este 		punto del código
		System.out.println("Resultado:");
		System.out.println(bScope);
		//Pruebas de SCOPE 3
		int aScope3 = 5;
		int bScope3 = 8;
		// b tomará un valor siempre, independientemente del valor de a 
		if (aScope3 == 5) {
			bScope3 = 3;
		} 
		// ahora ya no se producirá ningún error porque b tendrá valor siempre en este 		punto del código
		System.out.println("Resultado segundo SCOPE:");
		System.out.println(bScope3);
	}
}
