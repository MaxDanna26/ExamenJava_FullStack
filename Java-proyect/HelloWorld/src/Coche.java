
public class Coche extends Vehiculo {
	//Constructores
	public Coche() {
		super();
		this.caballos = 200.0f;
	}
	public Coche(float velocidad) {
		this.velocidad = velocidad;
		this.caballos = 150.0f;
		this.asientos = 5;
		this.ruedas = 4;
	}
	public Coche(float velocidad, float caballos) {
		this.velocidad = velocidad;
		this.caballos = caballos;
		this.asientos = 6;
		this.ruedas = 6;
	}
	public Coche(float velocidad, float caballos, 
			int asientos) {
		this.velocidad = velocidad;
		this.caballos = caballos;
		this.asientos = asientos;
		this.ruedas = 4;
	}
	public Coche(float velocidad, float caballos, 
			int asientos, int ruedas) {
		this.velocidad = velocidad;
		this.caballos = caballos;
		this.asientos = asientos;
		this.ruedas = ruedas;
	}
	//Atributos;
	private float caballos;
	
	//Métodos
	public static final float factorConversionCvKw = 1.35f;
	public void parar() {
		System.out.println("Método del coche");
	}
	public void acelerar() {
		this.velocidad += 5;
	}
	public void acelerar(float incrementoVelocidad) {
		this.velocidad += incrementoVelocidad;
	}
	public void desacelerar() {
		this.velocidad -= 5;
	}
	public void desacelerar(float decrementoVelocidad) {
		this.velocidad -= decrementoVelocidad;
	}
	public void desacelerar(boolean marchaAtras) {
		if(marchaAtras) this.velocidad = -5.0f;
		else desacelerar();
	}
	public void girarIzquierda() {}
	public void girarDerecha() {}
	
	public static float convertirCvKw(float caballos) {
		return caballos/factorConversionCvKw;
	}
	public static float convertirKwCv(float kilowatios) {
		return kilowatios*factorConversionCvKw;
	}
	
	//Métodos Setter y Getters
	public float getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}
	public float getCaballos() {
		return caballos;
	}
	public void setCaballos(float caballos) {
		this.caballos = caballos;
	}
	public int getAsientos() {
		return asientos;
	}
	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
}
