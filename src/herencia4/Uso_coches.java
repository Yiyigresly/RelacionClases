package herencia4;

public class Uso_coches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Nuevos coche1=new Nuevos("xsaer","blanco","leon","cuero");
   coche1.asginaColor("rojo");
   coche1.dameDatosCocheNuevo();//String matricula ,String color ,String modelo, int km, String anteriorDueño
   
   SegundaMano coche2=new SegundaMano("MXQ3","ROJO","aguila",1000,"jorge melendez");
   coche2.dameDatosCocheUsado();
   
   KmCero coche3=new KmCero("swqo0","azul","jaguar",500);
   coche3.dameDatosCochekmCero();
   
   coche2.asginaColor("violeta");// cambio color de ROJO a VIOLETA
   coche1.asignaModelo("aguila");// cambio de modelo de leon a aguila
   coche1.dameDatosGenerales();
   coche2.dameDatosGenerales();
	}
   
}
