package herencia4;
public class SegundaMano extends Producto{
	private int km;
	private  String anteriorDue�o;
 public SegundaMano(String matricula ,String color ,String modelo, int km, String anteriorDue�o) {
	 super(matricula,color,modelo);
	 this.km=km;
	 this.anteriorDue�o=anteriorDue�o;
 }// metdoso setters y getters
  public void asignaKilometros(int km) {
	  this.km=km;
  }
  public void asignaDue�o(String nuevoDue�o) {
	  anteriorDue�o=nuevoDue�o;
  }
   public String dameDue�o() {
	   return anteriorDue�o;
   }
   public int dameKm() {
	   return km;
   }// metodo para devolver datos del coche SEGUNDA MANO
   public void dameDatosCocheUsado() {
	   System.out.println("Datos coche Segunda Mano: "+"\nModelo: "+modelo+" ,Matricula: "
		   		+matricula+" ,color: "+color+" ,kilometros: "+km+ " AntiguoDue�o :"+ anteriorDue�o);
	   }
}
