package herenciaCorrecta;
/* Desarrollo para aprender USAR CONTANTES USO FINAL, queremos añadir una seccion para los EMPLEADOS NUEVOS
 * QUIENES pasaran por administraccion  primero
 * 2. Aprender a USAR EL STATIC IMPORTANTE*/
// PARA LLAMAR A UN STATIC(atributo o método) SE UTILIZA EL NOMBRE DE LA CLASE ," Empleados.IdSiguiente "YA QUE PERTENECE A LA CLASE NO A CADA OBJETO
public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1= new Empleados("Paco");
		Empleados trabajador2= new Empleados("ana");
		Empleados trabajador3= new Empleados("lucia");
		Empleados trabajador4= new Empleados("paco");
		trabajador1.cambiaSeccion("RRHH");
		
	/*  SOLUCIÓN A MEDIAS  Y REPETITIVO , NO RESPETO LA ENCALSULACIÓN HAEGO EL STATIC PUBLIC 
		System.out.println(trabajador1.devuelveDatos());
		Empleados.id++;// solucion a medias codigo repetitivo
		System.out.println(trabajador2.devuelveDatos());
		Empleados.id++;
		System.out.println(trabajador3.devuelveDatos());*/
		System.out.println(trabajador1.devuelveDatos()+"\n"+trabajador2.devuelveDatos()+
				"\n"+trabajador3.devuelveDatos()+"\n"+trabajador4.devuelveDatos());
		System.out.println(Empleados.dameIdSiguiente());
	
	}}
class Empleados{
	 // ESTADO INCIAL DE LO NUEVOS EMPLEADOS estan en administración
	public Empleados(String nom) {
	nombre=nom;	
	seccion="Administración";	
	id=IdSiguiente;
	IdSiguiente++;

	
	 }
	//Atributos 
	/* UNICO campo ID QUE COMPARTAN TODOS LOS OBJETOS DE LA MISMA CLASE NO CADA UNO LA SUYA, ES DECIR CADA OBJETO NO TENDRA SU COPIOA PROPIA
	 ID NO PERTENECE A NINGUN OBJETO, PERTENECES A LA CLASE
	public static int id; 1 solucion a medias pero no respecto ENCAPSULAMIENTO*/
	private final String  nombre;// permite no cambiarlo en el PROGRAMA asegurar que NADIE LO VA A CAMBIAR
    private byte id;// cada objeto tiene su propia copia
    private String seccion;// cada objeto tiene su propia copia 
    private static byte IdSiguiente=1;// NINGUN OBJETO TIENE SU PROPIA COPIA DE IdSiguiente, es mienbro de la clase
	
	 public void cambiaSeccion(String seccion) {
		 this.seccion=seccion;
	 }
	 public  String devuelveDatos() {
		 return "El nombre es "+nombre+" La sección es "+seccion+" y el ID es: "+id;
	 }
	 	 
	 // FINAL  EXPLICACIÓN Es verdad que java permite volver a cambiar el nombre PERO NO TIENE SENTIDO
	 // PARA ASEGURAR QUE ESTO NO SE VE AFECTADO ENTRE LAS MILES LINEAS DE CODIGO
	 // CREARE UNA CONTANTE final
	 
	 public static String dameIdSiguiente(){
		 /* un MÉTODO ESTATIC: solo puede acceder o usar variables del mismo tipo estatico 
		   1. No actua sobre objetos, su llamada va con la clases Empleados.metodoestaico
		   2. No acceden a campos de ejemplar(variable o constantes declaradas en la CLASE) a MENOS QUE SEAN TB STATIC
		   3.         
		        */ 
		 return "El IdSiguiente es: "+IdSiguiente;
	 }
	 
	 
 }

