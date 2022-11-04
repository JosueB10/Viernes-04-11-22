package Ejemplos;

public class Computadora {

	private Case elCase;
	private Monitor monitor;
	private TarjetaMadre tarjetaMadre;
	public Computadora(Case elCase, Monitor monitor, TarjetaMadre tarjetaMadre) {
		super();
		this.elCase = elCase;
		this.monitor = monitor;
		this.tarjetaMadre = tarjetaMadre;
	}
	private Case mostrarElCase() {
		return elCase;
	}
	public void ponerElCase(Case elCase) {
		this.elCase = elCase;
	}
	private Monitor mostrarMonitor() {
		return monitor;
	}
	public void ponerMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	private TarjetaMadre mostrarTarjetaMadre() {
		return tarjetaMadre;
	}
	public void ponerTarjetaMadre(TarjetaMadre tarjetaMadre) {
		this.tarjetaMadre = tarjetaMadre;
	}
	
	
	public void arrancarPC() {
		elCase.presionarBotonEncendido();
		dibujarLogo();
	}
	
	private void dibujarLogo() {
		monitor.dibujarPixelEn(1200, 50, "Negro");
	}
}
