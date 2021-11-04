package Herencia;
// vamos a decirle a java  que clase estudiante es una subclase o clase hija de clase Persona
// extends "clase"
public class Estudiante extends Persona{

	private int codigoEstudiante;
    private float notaFinal;

    // el CONSTRUCTOR  de una clase hija No es igual a las clase que NO HEREDAN NADA
    public Estudiante( String n, String a, int e,int codigoEstudiante,float notaFinal) {
    	super(n,a,e);// ya inicialice en la clase padre sólo los nombro
    	// estos noe stan inicializados, asi que los  hago
    	this.codigoEstudiante=codigoEstudiante;
    	this.notaFinal=notaFinal;
    }
// los metodos getters de la clase persona ya los hereda NO HACE FALTA VOLVER A ESCRIBIR
    // METODOS NO HEREDADOS : mostrar datos
    public void mostrarDatos() {
    	 System.out.println("Datos del Estudiante");
    	 System.out.println("Nombre : "+nombre);// accedo directamente por el modo de acceso declarado en persona
    	 System.out.println("Apellidos :"+getApellidos()+
    	  "\nEdad: "+getEdad()+
    	    "\nCodigo Estudiante "+codigoEstudiante+
    	    "\nSu nota final es:"+notaFinal);
    	
    }
   
  
  
}
