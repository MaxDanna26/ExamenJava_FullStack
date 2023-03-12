
public class Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		// se generación una excepción porque en la sexta iteración del bucle se realiza laoperación matemática 5/0 (infinito) y ese valor no puede ser almacenado en unavariable de tipo int. Se arroja una excepción de tipo ArithmeticException y el programase detiene en ese punto
//		for(int i = -5; i < 5; i++) 
//			{int c = 5 / i;
//			System.out.println(c);}
//	/*Exception in thread "main" java.lang.ArithmeticException: / by zero at Main.main(Main.java:9)*/

		try {for(int i = -5; i < 5; i++) 
		{int c = 5 / i;
		System.out.println(c);}}
//		// captura la excepción de tipo ArithmeticException
//		catch (ArithmeticException e) {System.out.println("Excepcion aritmetica");}
		// captura cualquier otra excepción que pueda producirse
		catch (Exception e) {System.out.println("Otro error desconocido");}
		System.out.println("Programa finalizado");
		
	}

}
