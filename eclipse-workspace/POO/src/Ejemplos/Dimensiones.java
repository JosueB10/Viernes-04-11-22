package Ejemplos;

public class Dimensiones {

	private int anchura;
	private int altura;
	private int profundidad;
	public Dimensiones(int anchura, int altura, int profundidad) {
		super();
		this.anchura = anchura;
		this.altura = altura;
		this.profundidad = profundidad;
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
	public int mostrarProfundidad() {
		return profundidad;
	}
	public void ponerProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}
	
	
	
	
}
