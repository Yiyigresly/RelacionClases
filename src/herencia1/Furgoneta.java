package herencia1;

public class Furgoneta extends Coche {
	private   int capacidad_carga;//variable encapsulada
	private   int plazas_extra; 
	
	public Furgoneta (int capacidad_carga,int plazas_extra) {
		super();//llamar al constructor de la clase padre COCHE;
		// al llamarlo le estaremos dando el valor incial clase coche 
		this.capacidad_carga=capacidad_carga;// INCIALIZAMOS ATRIBUTOS PROPIOS
		this.plazas_extra=plazas_extra;
	}
// METODO GETTER PARA DEVOLVER VALORES HEREDADOS Y PROPIOS
	public String dime_datos_Furgoneta() {
		return "\nSu capacidad carga: "+capacidad_carga+"\nPlazas extras: "+
	           + plazas_extra;
				}
}
