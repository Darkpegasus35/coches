package Ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;

public class Coche {
		
			private String matricula;
		    private String marca;
		    private String modelo;
		    private int año;
		    private double precio;

		  //Creamos método constructor.
		    
		    public Coche(String matricula, String marca, String modelo, int año, double precio) {
		        this.matricula = matricula;
		        this.marca = marca;
		        this.modelo = modelo;
		        this.año = año;
		        this.precio = precio;
		    }
		    
		    //Creamos método contructor vacío.
		    
		    public Coche()  {
		    	
		    }
		
		 // Ahora creamos los métodos get y set
		    
		    public void setMatricula(String matricula)  {
		    	
		    	this.matricula = matricula;
		    }
		    
		    public void setMarca(String marca)   {
		    	
		    	this.marca = marca;
		    }
		    
		    public void setModelo(String modelo)  {
		    	
		    	this.modelo = modelo;
		    }
		    
		    public void setAño(int año)   {
		    	
		    	this.año = año;
		    }
		    
		    public void setPrecio(double precio)  {
		    	
		    	this.precio = precio;
		    }
		    
		    public String getMatricula() {
		    	
		        return matricula;
		    }

		    public String getMarca() {
		    	
		        return marca;
		    }

		    public String getModelo() {
		    	
		        return modelo;
		    }

		    public int getAño() {
		    	
		        return año;
		    }

		    public double getPrecio() {
		    	
		        return precio;
		    }
		    
		    

		  //Creamos el método para mostrar los detalles de los vehículos
		    
		    public void mostrarDetalles() {
		        System.out.println("Matrícula: " + matricula);
		        System.out.println("Marca: " + marca);
		        System.out.println("Modelo: " + modelo);
		        System.out.println("Año: " + año);
		        System.out.println("Precio: " + precio + " Euros");
		        System.out.println("--------------------");
		    
		    }
		  
		    // A partir de aquí estoy haciendo pruebas para crear objeto de la clase coche vacío y añadirle posteriormente datos.
		    
		    
		    public static void main(String[] args) {
		    
		    //Creamos nuevo objeto Coche vacío.
		    	
		    Coche cocheVacio = new Coche();
		    
		    // Mostramos los datos inexistentes del coche vacío
		    
		    	System.out.println("--------------------");
		    	System.out.println("Esto es un objeto de la clase coche sin datos: ");
		    	cocheVacio.mostrarDetalles();
		    
		    // Le añadimos datos al coche vacío
		    
		    	cocheVacio.setMatricula("3842GKB");
		    	cocheVacio.setMarca("Skoda");
		    	cocheVacio.setModelo("Fabia");
		    	cocheVacio.setAño(2010);
		    	cocheVacio.setPrecio(13000);
		    
		    // Mostramos los nuevos datos añadidos.
		    
		    	System.out.println("Esto es un coche vacío con datos añadidos: " );
		    	cocheVacio.mostrarDetalles();
		   
		    
		    		    	
		// voy a crear un objeto aquí para pasar luego una matrícula y si coincide nos la muestre, por seguir el ejercicio
		// aunque entiendo que esto sería mejor en la clase concesionario
		    	
		    Coche cocheDavid = new Coche ("210488", "David", "Ibergallartu", 1988, 50000.0);
		    	 System.out.println("--------------------");
		    	 System.out.println("Ahora pedimos los datos al usuario: ");
		    	
		    	Scanner scanner = new Scanner(System.in);
				System.out.print("Por favor, ingrese matrícula: ");
				String matricula_introducida = scanner.next();
				
				System.out.println("La matrícula introducida es: " + matricula_introducida);
				System.out.println("Buscando datos del vehículo......");
				
				scanner.close();
		    	
				if (matricula_introducida.equals(cocheDavid.getMatricula())) {
					
				cocheDavid.mostrarDetalles();
				
				}
				
				else {
					
					System.out.println("Matrícula no encontrada");
				}
				
				}
		    
}
				
				
	
		

	

		 

	
		
	


