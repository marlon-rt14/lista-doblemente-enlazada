package app;

public class Estudiante {

	private int ID;
	private String nombre;
	Estudiante siguiente;
	Estudiante anterior;

	public Estudiante(int ID, String nombre) {
		this.ID = ID;
		this.nombre = nombre;
		this.siguiente = null;
		this.anterior = null;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estudiante getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Estudiante siguiente) {
		this.siguiente = siguiente;
	}

	public Estudiante getAnterior() {
		return anterior;
	}

	public void setAnterior(Estudiante anterior) {
		this.anterior = anterior;
	}

}
