package Ejemplos;

public class Resolucion {

	private int anchura;
	private int altura;
	
	
	public Resolucion(int anchura, int altura) {
		this.anchura = anchura;
		this.altura = altura;
	}


	public int mostrarAnchura() {
		return anchura;
	}


	public void ponerAnchura(int anchura) {
		this.anchura = anchura;
	}


	public int mostrarAltura() {
		return altura;
	}


	public void ponerAltura(int altura) {
		this.altura = altura;
	}
	
	
	
	
}
