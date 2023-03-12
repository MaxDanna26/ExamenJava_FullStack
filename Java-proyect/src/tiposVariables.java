
public class tiposVariables {
	public static void main(String[, args]) {
		byte b = 5;
		short s = 128;
		int i = 40000:
	// en variables de tipo long hay que añadir el carácter L al final del número
		long l = 2222222222L;
		
		// declaración correcta
		int j = 2147483647;
		// error porque las variables de tipo int no puede almacenar un número de esa magnitud
		int k = 2147483648;
		// long sí admite valores de esta magnitud
		long l = 2147483648L;
		
		
		
		// Ejercicio: escribe un programa con cuatro variables de tipo entero (a, b, c y d) y uncondicional que imprima por pantalla 
		// si la suma de a y b es mayor que la suma de c y d.
		
		int a = 10;
		int b = 11;
		int c = 12;
		int d = 13;
		
		System.out.printf("%d + %d + %d = %d" ,a,b,c,d).println();
}
		
		
		// Ejercicio: escribe un programa que almacene tres ángulos de un triángulo en variables detipo entero (angulo1, angulo2 y angulo3). Crea un condicional que compruebe si esostres ángulos juntos pueden formar un triángulo (los ángulos de un triángulo sumansiempre 180 grados)
		
		// Ejercicio: escribe un programa con una variable de tipo entero (a) y un condicional queevalúe si el entero es par o impar utilizando el operador %
	}
}
