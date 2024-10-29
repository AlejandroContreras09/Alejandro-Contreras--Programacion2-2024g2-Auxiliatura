package SistemadeTareasdeAventura;

public class MainTareas {
	 public static void main(String[] args) {
	     Aventura aventura = new Aventura();

	     aventura.agregarTarea(() -> System.out.println("Explorando  Pisos picados..."));
	     aventura.agregarTarea(() -> System.out.println("Luchando contra  el dragon..."));
	     aventura.agregarTarea(() -> System.out.println("Recogiendo una Scar..."));

	     aventura.iniciar();
	 }
	}
