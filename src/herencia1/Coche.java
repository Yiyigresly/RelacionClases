package herencia1;

public class Coche {
	//atributos
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
    protected String color;
	private boolean asientos_cuero,climatizador;
	// contructor 
	public Coche() { //constructor que proporcionaba el Estado Inicial
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;}
	// getters
	public String dime_datos_Generales() {
		return "\nla plataforma del vehiculo tiene "+ruedas+" ruedas"+"\nMide de largo: "+largo+
				"\nTiene de Ancho:"+ancho+
				"\nSu Motor es de:"+motor+" caballos"+
				"\nEl peso de plataforma es:"+peso_plataforma+"kg";}
	public void establecer_Color(String color_coche) {// pides por paramatre el color del coche para inicializarlo 
		this.color=color_coche;
	}
	public String getColor() {// devuelves el color del coche
		return color;
	}
	//
	public void configurar_Asientos(String asientos_cuero) {// pide por parametros saber si es de cuero el asiento
		if (asientos_cuero.equalsIgnoreCase("si"))
		{this.asientos_cuero=true;}
		else {this.asientos_cuero=false;}}
	public String dime_Asientos() {
		if (asientos_cuero==true)
		{return "Los asientos son de cuero.";}
		else {return "Los asientos son de serie.";}}
		// configurar el climaticador uso un SETTER
	public void configurar_Climatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si"))
		{this.climatizador=true;}
		else {this.climatizador=false;}
	}
// GET CLIMATIZADOR 
	 public String dime_Climatizador(){
		 if(climatizador==true) {
			 return "El VEHICULO incorpora climatizador.";}
		 else {return "El VEHICULO no incorpora climatizador.";}
}}
