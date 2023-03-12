
public class Avion extends Vehiculo{
	//Constructores
	public Avion() {
		this.trenAterrizaje = true;
	}
	public Avion(boolean trenAterrizaje) {
		this.trenAterrizaje = trenAterrizaje;
	}
	//Atributos
	private boolean trenAterrizaje;
	//Métodos
	public void volar() {}
	public void aterrizaje() {}
	public void parar() {
		System.out.println("Método del avión");
	}
	
	//Getters y setters
	public boolean isTrenAterrizaje() {
		return trenAterrizaje;
	}
	public void setTrenAterrizaje(boolean trenAterrizaje) {
		this.trenAterrizaje = trenAterrizaje;
	}
	
}
