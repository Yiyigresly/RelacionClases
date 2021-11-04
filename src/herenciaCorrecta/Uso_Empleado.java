package herenciaCorrecta;/* FICHERO FUENTE ALVERGA VARIAS CLASES:
 1.CASO PARTICULAR:CONTRUCCION 2 CLASES EN UN MISMO FICHERO FUENTE 
 2.SOLO UNA DE ESAS CLASES ALMACENA EL MODODIFICADOR DE ACCESO "PUBLICO" Y SOLO UNA DE LAS CLASES  TENDRA EL METODO MAIN
 3.cuando EJECUTAS PROGRAMA la ejecución "EMPIEZA 100PRE" por el "Metodo MAIN" DE  "CLASE PÚBLICA"*/

import java.util.*;//  importamos librerias para poder usar DATE y GreogorianCalendar

public class Uso_Empleado {


	
public static void main( String []args) {
	/*
	Empleado empleado1=new Empleado("Gresly Orbegozo",12000,2018,10,25);
	Empleado empleado2=new Empleado("kelly Orbegozo",30000,2000,2,1);
	Empleado empleado3=new Empleado("María Saldaña",105000,1995,2,25);
	System.out.println("Fecha Alta empleado1: "+empleado1.dameFechaAlta()
	+"\nFecha Alta empleado2 :"+empleado2.dameFechaAlta()
	+ "\nFecha Alta empleado3: "+empleado3.dameFechaAlta());
	empleado1.subirSueldo(10);
	empleado2.subirSueldo(5);
	empleado3.subirSueldo(10);
	System.out.println("\nNombre: "+empleado1.dameNombre()
	+" Fecha Alta: "+empleado1.dameFechaAlta()+" Sueldo: "+empleado1.dameSueldo());
	
	System.out.println("\nNombre: "+empleado2.dameNombre()
	+" Fecha Alta: "+empleado2.dameFechaAlta()+" Sueldo: "+empleado2.dameSueldo());
	
	System.out.println("\nNombre: "+empleado3.dameNombre()
	+" Fecha Alta: "+empleado3.dameFechaAlta()+" Sueldo: "+empleado3.dameSueldo());*/
	
	Empleado[] misEmpleados=new Empleado[3]; /* Estoy creando un ARRAY DE LA CLASE EMPLEADO QUE ALMACENA
	3 POSICIONES DEL 0 AL 2. En cada posición almacena los datos iniciales de cada emppleado*/
	misEmpleados[0]=new Empleado("Gresly",12000,2020,07,01);
	misEmpleados[1]=new Empleado("kelly",12500,1987,5,18);
	misEmpleados[2]=new Empleado("maria",12300,2021,02,1);
	/* FOR TRADICIONAL
	 for (int i=0; i<3;i++ ) {
		 misEmpleados[i].subirSueldo(5);  }*/
	//--------comprobación de INICILIZAR SIN COLOCAR DIMENSION CORCHETES CON INICIALIZADOR ENTRE LLAVES
	
    Empleado [] v= new Empleado[] {new Empleado("pepe",1000,2000,01,14),
    		new Empleado("pepe",1000,2000,01,14),
    		new Empleado("pepe",1000,2000,01,14)};
	//----------
	/*for ( Empleado e: misEmpleados) { // FOR MEJORADO 
		e.subirSueldo(10);
		}*/
	
// FOR TRADICIONALL 
	   for (int i=0; i<v.length;i++ ) { 
	   System.out.println("Nombre: "+misEmpleados[i].dameNombre()+" Sueldo: "+misEmpleados[i].dameSueldo());
	   System.out.println(misEmpleados[i]);
	   
	   /*
	for (Empleado e:misEmpleados) { 
		 System.out.println("Nombre: "+e.dameNombre()+" Sueldo: "+e.dameSueldo());
	}*/
		
}
 

}}
class Empleado{
	//ATRIBUTOS EMPLEADO PUEDEN IR AL FINAL DE LA CLASE O AL PRINCIPIO NO HAY PROBLEMAS
	private String nombre;// String indica que nombre es una variable de tipo objeto NO ES PRIMITIVO COMO INT LONG DOUBLE
	private double sueldo;
	private Date altaContrato;// ""Date"" No pertenece al PAQUETE principal= "java.lang" POR DEFECTO como es "String"
	// Hay que importar el paquete java.util
	
  //-------------------------------------------------------------------------------------
	/* CONTRUCTOR 1 INICIALIZAREMOS EL NOMBRE,SUELDO Y FECHA DE ALTA(ALTA DE CONTRATO)
	 ALTA CONTRATO= AÑO,MES Y DIA)*/
    public Empleado(String nom,double sue,int agno,int mes,int dia) {
	nombre=nom;
	sueldo=sue;
	
	/* Vamos a usar la clase "GregorianCalendar" no hace falta IMPORTAR ya que está en JAVA.UTIL
       objetivo de esta clase es CREAR UNA FECHA NADA MÁS*/
	GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);// mes-1 debido a que para la clase no existe enero
	altaContrato=calendario.getTime(); // Como el metodo getTime devuelve un tipo Date, lo asigno a la variable "altaContrato";
	}
    
    
     public String dameNombre() {// getter
    	 return nombre;
    	 }
     public double dameSueldo() {return sueldo;// getter SUELDO
     }
     public Date dameFechaAlta() {// getter FECHA DE ALTA
    	 return altaContrato;
     }
     
     /*Quiero crear un método que me permita variar el sueldo que en su momento inicialice, para SUBIRLO en este caso
      * Usaré un SETTER*/
     public void subirSueldo(double porcentaje) { // imaginemos pasamos por parámetro 5.0
    	
    	 double aumento=porcentaje*sueldo/100;
    	 
    	 sueldo+=aumento; // + (INCREMENTANDO)ES IGUAL A "sueldo=aumento+sueldo;"
     }
     public String toString() {
    	 return sueldo+","+altaContrato;
     }
}



     
   // ------------------------------------------------------------------------------------------
	// metodo contructor:Trabajadores NUEVOS EMPIEZAN CON EL MISMO SUELDO
	