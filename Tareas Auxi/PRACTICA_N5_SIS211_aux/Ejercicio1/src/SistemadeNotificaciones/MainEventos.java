package SistemadeNotificaciones;

public class MainEventos {
	 public static void main(String[] args) {
	     Evento evento1 = new Evento("Evento final de Temporada");
	     Evento evento2 = new Evento("Evento final de Temporada");
	     
	     evento1.registrarNotificacion(mensaje -> System.out.println("Notificación 1: " + mensaje));
	     evento1.registrarNotificacion(mensaje -> System.out.println("Notificación 2: " + mensaje));
	     
	     evento1.activar();
	 }
	}