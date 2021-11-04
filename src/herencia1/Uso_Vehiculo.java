package herencia1;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// Vamos  Instanciar clase coche primero
		Coche micoche1=new Coche();
        micoche1.establecer_Color("azul");
        micoche1.configurar_Climatizador("No");
       
        System.out.println("Datos coche1:"+micoche1.dime_datos_Generales()+"\nEl color es: "+
        		  micoche1.getColor()+"\n"+
        		  micoche1.dime_Climatizador());
    
          // INSTANCIAR O CREEAR FURGONETA SABEMOS QQUE HEREDA
        Furgoneta furgoneta1=new Furgoneta(508,7);
        furgoneta1.establecer_Color("rojo");
        System.out.println("\nDatos furgoneta1:"+furgoneta1.dime_datos_Generales()+
        		" "+furgoneta1.dime_datos_Furgoneta() +
        		"\nEl color es: "+furgoneta1.getColor()) ;
        furgoneta1.configurar_Asientos("no");
        furgoneta1.configurar_Climatizador("si");
        System.out.println( furgoneta1.dime_Asientos()+" "+furgoneta1.dime_Climatizador());
  
       
        
}}
