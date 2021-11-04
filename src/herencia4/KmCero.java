package herencia4;

public class KmCero extends Producto {
	private  int numkm;
	public KmCero (String matricula ,String color ,String modelo,int numkm) {
		   super(matricula,color,modelo);
		   this.numkm=numkm;
	}
	
   public void  asignaKilometros( int km) {
	  this.numkm=km;}
   public int DameKilometros() {
	   return numkm;}
   public  void dameDatosCochekmCero() {
	   System.out.println( "Datos coche km0: "+"\nModelo: "+modelo+" ,Matricula: "
	   		+matricula+" ,color: "+color+" ,kilometros: "+numkm);
   }
   }
   
  

