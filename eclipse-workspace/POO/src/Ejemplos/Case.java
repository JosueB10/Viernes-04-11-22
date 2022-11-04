package Ejemplos;

public class Case {
private String modelo;
private String fabricante;
private String fuenteDePoder;
private Dimensiones dimensiones;
public Case(String modelo, String fabricante, String fuenteDePoder, Dimensiones dimensiones) {
	super();
	this.modelo = modelo;
	this.fabricante = fabricante;
	this.fuenteDePoder = fuenteDePoder;
	this.dimensiones = dimensiones;
}



public void presionarBotonEncendido() {
System.out.println("Boton de encendido presionado!");	
	
}



public String mostrarModelo() {
	return modelo;
}



public void ponerodelo(String modelo) {
	this.modelo = modelo;
}



public String mostrarFabricante() {
	return fabricante;
}



public void ponerFabricante(String fabricante) {
	this.fabricante = fabricante;
}



public String mostrarFuenteDePoder() {
	return fuenteDePoder;
}



public void ponerFuenteDePoder(String fuenteDePoder) {
	this.fuenteDePoder = fuenteDePoder;
}



public Dimensiones mostrarDimensiones() {
	return dimensiones;
}



public void ponerDimensiones(Dimensiones dimensiones) {
	this.dimensiones = dimensiones;
}



}
