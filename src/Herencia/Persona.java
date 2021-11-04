package Herencia;

public class Persona {
	//atributos en vez de hacerlos privados  usamos los protegidos PROTECTED
	// para que pueda ser accedidad por su clase hija
	protected String nombre;
	
	// Pero para mantener el encapsulamiento de manera correcta  mantenemos private
	private String apellidos;
	private int edad;
	
	// método constructor
	 public Persona( String nombre, String apellidos, int edad) {this.nombre=nombre;
		 this.apellidos=apellidos;
		 this.edad=edad; } 
		
	 // métodos getters
	 public String getNombre() {
		 return nombre;
	 }
	 public String getApellidos() {
		 return apellidos;
	 }
	 public int getEdad() {
		 return edad;
	 }

}
