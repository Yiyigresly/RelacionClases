package herencia4;

public class Nuevos extends Producto{
    private  String tipo_asiento;
    public Nuevos (String matricula ,String color ,String modelo,String asient){
    	super(matricula,color,modelo);
    tipo_asiento=asient;
    }
	public void setAsiento(String asiento) {
		
		tipo_asiento=asiento;
	}
    public String dameTipoAsiento() {
    	return tipo_asiento;
    }
     public void dameDatosCocheNuevo() {
    	 System.out.println( "Datos coche Nuevo: "+"\nModelo: "+modelo+" ,Matricula: "
 		   		+matricula+" ,color: "+color+
 		   		" ,tiene asientos de tipo: "+tipo_asiento);
     }
}
