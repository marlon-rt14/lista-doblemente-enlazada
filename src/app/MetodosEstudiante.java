package app;

public class MetodosEstudiante {

	Estudiante estudiante;
	int contadorId;

	public MetodosEstudiante() {
		this.estudiante = null;
		contadorId = 1;
	}

	private boolean estaVacia(Estudiante lista) {
		if (lista == null) {
			return true;
		} else {
			return false;
		}
	}

	public void agregar(String nombre) {
		Estudiante nuevo = new Estudiante(contadorId, nombre);
		if (estaVacia(estudiante)) {
			estudiante = nuevo;
			contadorId++;
		} else {
			Estudiante actual = estudiante;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			//Estudiante pivote = actual;
			actual.setSiguiente(nuevo);
			actual.getSiguiente().setAnterior(actual);
			contadorId++;
		}
	}

	public void actualizar(int id, String nombre) {
		Estudiante actual = estudiante;
		while (!estaVacia(actual)) {
			if (actual.getID() == id) {
				actual.setNombre(nombre);
				break;
			} else {
				actual = actual.getSiguiente();
			}
		}
	}

	public void eliminar(int id) {
		if (estudiante.getID() == id) {
			estudiante = estudiante.getSiguiente();
			estudiante.setAnterior(null);
		} else {
			Estudiante actual = estudiante;
			while (!estaVacia(actual)) {
				if (actual.getSiguiente().getID() == id) {
					Estudiante continuacion = actual.getSiguiente().getSiguiente();
					actual.setSiguiente(continuacion);
					actual.setAnterior(actual.getAnterior());
					break;
				} else {
					actual = actual.getSiguiente();
				}
			}
		}
	}

	public void imprimirAdelante() {
		Estudiante actual = estudiante;
		while (!estaVacia(actual)) {
			System.out.println("ID: " + actual.getID());
			System.out.println("Nombre: " + actual.getNombre());
			System.out.println("_______________________ \n");
			actual = actual.getSiguiente();
		}
	}

	public void imprimirAtras() {
		Estudiante actual = estudiante;
		while (actual.getSiguiente() != null) {
			actual = actual.getSiguiente();
		}

		while (actual != null) {
			System.out.println("ID: " + actual.getID());
			System.out.println("Nombre: " + actual.getNombre());
			System.out.println("_______________________ \n");
			actual = actual.getAnterior();
		}
	}

	public void imprimirPorReferenciaAdelante(int id) {
		Estudiante actual = estudiante;
		while (!estaVacia(actual)) {
			if (actual.getID() == id) {
				System.out.println("ID: " + actual.getSiguiente().getID());
				System.out.println("Nombre: " + actual.getSiguiente().getNombre());
				System.out.println("_______________________ \n");
				break;
			} else {
				actual = actual.getSiguiente();
			}
		}
	}

	public void imprimirPorReferenciaAtras(int id) {
		Estudiante actual = estudiante;
		while (!estaVacia(actual)) {
			if (actual.getID() == id) {
				System.out.println("ID: " + actual.getAnterior().getID());
				System.out.println("Nombre: " + actual.getAnterior().getNombre());
				System.out.println("_______________________ \n");
				break;
			} else {
				actual = actual.getSiguiente();
			}
		}
	}

}
