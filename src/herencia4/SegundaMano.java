package herencia4;
public class SegundaMano extends Producto{
	private int km;
	private  String anteriorDueño;
 public SegundaMano(String matricula ,String color ,String modelo, int km, String anteriorDueño) {
	 super(matricula,color,modelo);
	 this.km=km;
	 this.anteriorDueño=anteriorDueño;
 }// metdoso setters y getters
  public void asignaKilometros(int km) {
	  this.km=km;
  }
  public void asignaDueño(String nuevoDueño) {
	  anteriorDueño=nuevoDueño;
  }
   public String dameDueño() {
	   return anteriorDueño;
   }
   public int dameKm() {
	   return km;
   }// metodo para devolver datos del coche SEGUNDA MANO
   public void dameDatosCocheUsado() {
	   System.out.println("Datos coche Segunda Mano: "+"\nModelo: "+modelo+" ,Matricula: "
		   		+matricula+" ,color: "+color+" ,kilometros: "+km+ " AntiguoDueño :"+ anteriorDueño);
	   }
}
