package Ejemplos;

public class App {

	public static void main(String[] args) {
		Dimensiones dimensiones = new Dimensiones (20,20,5);
		Case cajon = new Case("220B","Dell","460",dimensiones);
		Monitor monitor= new Monitor("Beast de 27","Beast",7,new Resolucion(2540,1140));
		TarjetaMadre tarjetaMadre = new TarjetaMadre("BJ-200","Asus",4,6,"v2.44");
		
		
         
         Computadora pc = new Computadora(cajon,monitor,tarjetaMadre);
         pc.arrancarPC();
         
         
	}

}
