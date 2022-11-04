package Ejemplos;

public class Monitor {

	private String modelo;
	private String fabricante;
	private int tamanio;
	private Resolucion resolucionNativa;  //Esto es composicion 
	public Monitor(String modelo, String fabricante, int tamanio, Resolucion resolucionNativa) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.tamanio = tamanio;
		this.resolucionNativa = resolucionNativa;
	} 
	
	public void dibujarPixelEn(int x, int y, String color) {
		System.out.println("Dibujando pixel en "+x+","+y+"en color" +color);
	}

	public String mostrarModelo() {
		return modelo;
	}

	public void ponerModelo(String modelo) {
		this.modelo = modelo;
	}

	public String mostrarFabricante() {
		return fabricante;
	}

	public void ponerFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int mostrarTamanio() {
		return tamanio;
	}

	public void ponerTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public Resolucion mostrarResolucionNativa() {
		return resolucionNativa;
	}

	public void ponerResolucionNativa(Resolucion resolucionNativa) {
		this.resolucionNativa = resolucionNativa;
	}
	
	
	
	
}
