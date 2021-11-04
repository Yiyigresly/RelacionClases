package Herencia;
// REUTILIZAR EL CÓDIGO QUE UN DÍA DE PROGRAMÓ AHORRANDO CÓDIGO O VOLVER A ESCRIBIR
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona [] probando=new Estudiante[] {
				//String nombre, String apellidos, int edad,int codigoEstudiante,float notaFinal
				new Estudiante("guisell","orbegozo",35,123,5.6f),
				new Estudiante("ester","orbegozo",19,34,6.5f)
		
		};
 Estudiante est1=new Estudiante("Eduardo","Mendoza Alvado",28,126,8.5f);
            est1.mostrarDatos();
            // mosttrando datos variable array probando SOLO PUEDE USAR LOS DE LA VARIABLE persona
            for(Persona c:probando) {
         System.out.println(c.getNombre()+" "+c.getApellidos()+
        		
        		" "+c.getEdad());}
            
            
         // otra situación
      
   

}
}
