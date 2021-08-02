
package app;

import java.util.Scanner;


public class prueba {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
	MetodosEstudiante estudiante = new MetodosEstudiante();
	
	String nombre = "";
	int id = 0;
        
        int op = 0;
        
        System.out.println("CREAR UNA LISTA SIMPLE: ");
        System.out.println("");
        
        do {
            System.out.println("SELECCIONE UNA OPCION DEL MENU: ");
            System.out.println("1.- Agregar\n2.- Acutalizar\n3.- Eliminar\n4.- Imprimir hacia adelante\n"
		    + "5.- Imprimir hacia atras\n6.- Salir");
            op = dato.nextInt();
            System.out.println("");
            switch(op) {
                case 1: 
			System.out.print("Nombre: ");
			nombre = dato.next();
			System.out.println("");
			estudiante.agregar(nombre);
                    break;
                case 2: 
			System.out.print("ID: ");
			id = dato.nextInt();
			System.out.print("NOmbre: ");
			nombre = dato.next();
			System.out.println("");
			estudiante.actualizar(id, nombre);
                    break; 
                case 3:
			System.out.println("ID: ");
			id = dato.nextInt();
			System.out.println("");
			estudiante.eliminar(id);
                    break;
                case 4:
			estudiante.imprimirAdelante();
                    break;
                case 5: 
			estudiante.imprimirAtras();
                    break;
		case 6:
			break;
            }
        } while (op != 6);
        
        
    }
    
}
