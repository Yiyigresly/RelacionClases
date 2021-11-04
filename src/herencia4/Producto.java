package herencia4;
public class Producto {
	protected String matricula;
	protected String color;
	protected String modelo;
	public Producto(String matricula,String color,String modelo) {
		this.matricula=matricula;
		this.color=color;
		this.modelo=modelo;}
	 // métodos setters
	 public void asignaMatricula(String matri) {
		  matricula=matri; }
	 public void asginaColor(String colour) {
		  color=colour; }
	 public void asignaModelo(String model) {
		  modelo=model; }
	// métodos getters
     public String getMatricula() {
			 return matricula; }
     public String getColor() {
			 return color; }
	public String getModelo() {
			 return modelo;}
    // devuelve información del producto en General
     public void dameDatosGenerales() {
			    System.out.println("Datos Generales Producto: "+"\nModelo: "+modelo+" ,Matricula: "
		      +matricula+" ,color: "+color);
		  }
}

 
