package Ejemplos;

public class TarjetaMadre {

	private String modelo;
	private String fabricante;
	private int bancosMemoria;
	private int bancosExpansion;
	private String nombreBios;
	public TarjetaMadre(String modelo, String fabricante, int bancosMemoria, int bancosExpansion, String nombreBios) {
	
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.bancosMemoria = bancosMemoria;
		this.bancosExpansion = bancosExpansion;
		this.nombreBios = nombreBios;
	}
	
	public void cargarPrograma(String programa) {
		
		System.out.println("El programa "+programa+" esta cargando!");
		
	}

	public String MostrarModelo() {
		return modelo;
	}

	public void ponerModelo(String modelo) {
		this.modelo = modelo;
	}

	public String MostrarFabricante() {
		return fabricante;
	}

	public void ponerFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int MostrarBancosMemoria() {
		return bancosMemoria;
	}

	public void ponerBancosMemoria(int bancosMemoria) {
		this.bancosMemoria = bancosMemoria;
	}

	public int MostrarBancosExpansion() {
		return bancosExpansion;
	}

	public void ponerBancosExpansion(int bancosExpansion) {
		this.bancosExpansion = bancosExpansion;
	}

	public String MostrarNombreBios() {
		return nombreBios;
	}

	public void ponerNombreBios(String nombreBios) {
		this.nombreBios = nombreBios;
	}
	
	
	
}
