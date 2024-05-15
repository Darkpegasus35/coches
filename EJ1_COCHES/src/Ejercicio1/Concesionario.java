package Ejercicio1;
import java.util.ArrayList;
import Ejercicio1.Coche;

public class Concesionario {

	private String nombre;
	private String ubicacion;
	ArrayList<Coche> inventario;
	
	//Creamos el método constructor para la clase Concesionario.
	 
		 public Concesionario(String nombre, String ubicacion) {
		 
			 this.nombre = nombre;
			 this.ubicacion = ubicacion;
			 this.inventario = new ArrayList<>();
		 }


		 public String getNombre() {
		        return nombre;
		    }
		 
		 public String getUbicacion() {
		        return ubicacion;
		    }
		 
		 public ArrayList<Coche> getInventario() {
		        return inventario;
		    }

		 public void setNombre(String nombre)
		    {
		    	this.nombre = nombre;
		    }
		   
		 public void setUbicacion(String ubicacion)
		    {
		    	this.ubicacion = ubicacion;
		    }
		   
		 public void setInventario(ArrayList<Coche> inventario)
		    {
		    	this.inventario = inventario;
		    }
		 
		//Creamos un método que pueda agregar nuevos coches a nuestro concesionario.
		 
		 public void agregarCoche(Coche coche) {
		 
			 inventario.add(coche);
		 }

		//Creamos un método para mostrar el inventario del concesionario.
		 
		 public void mostrarInventario() {
		 
			 System.out.println("El inventario de nuestro concesionario " + nombre + " situado en " + ubicacion);
			 System.out.println("--------------------------");
			 for (Coche coche : inventario)
				 
				 coche.mostrarDetalles();
				 System.out.println("-------------------------");
		 }

		 public static void main(String[] args) {
			 
		// Creamos varios objetos de la clase coche.
			 
		 Coche coche1 = new Coche("210488", "David", "Ibergallartu", 1988, 50000.0);
		 Coche coche2 = new Coche("3842GKB", "Skoda", "Fabia", 2008, 15000.0);
		 Coche coche3 = new Coche("2585HJK", "Citroen", "Berlingo", 2020, 30000.0);
		 
		// Creo el objeto de la clase Concesionario para poder añadir los coches más tarde.
		 
		Concesionario concesionario = new Concesionario("Ibergallartu Cars", "Logroño, es:");
		 
		// Agregamos los coches al inventario del concesionario.
		 
		concesionario.agregarCoche(coche1);
		concesionario.agregarCoche(coche2);
		concesionario.agregarCoche(coche3);
		
		
		// Mostramos el inventario completo.
		
		concesionario.mostrarInventario();
}
}
