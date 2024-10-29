package SistemadeBonificaciones;

public class MainBonificaciones {
	 public static void main(String[] args) {
	     Jugador jugador = new Jugador("Alexito Contreras", 100);

	     jugador.aplicarBonificacion(puntosBase -> (int)(puntosBase * 0.1)); // Bonificación del 10%
	     jugador.aplicarBonificacion(puntosBase -> 20); // Bonificación fija de 20 puntos

	     System.out.println(jugador);
	 }
	}
