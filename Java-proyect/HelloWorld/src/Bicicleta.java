
public class Bicicleta extends Vehiculo {
	//Constructores
	public Bicicleta() {
		this.cambios= 15;
	}
	public Bicicleta(int cambios) {
		this.cambios = cambios;
	}
	//Atributo
	private int cambios;
	//Getters y setters
	public int getCambios() {
		return cambios;
	}
	public void setCambios(int cambios) {
		this.cambios = cambios;
	}
	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("Método de la bici");

	}
}
