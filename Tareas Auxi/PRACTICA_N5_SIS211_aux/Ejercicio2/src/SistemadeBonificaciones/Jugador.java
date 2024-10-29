package SistemadeBonificaciones;

//Interfaz funcional para calculadoras de bonificación
@FunctionalInterface
interface CalculadoraBonificacion {
 int calcular(int puntosBase);
}

//Clase que representa un jugador
class Jugador {
 private String nombre;
 private int puntos;

 public Jugador(String nombre, int puntos) {
     this.nombre = nombre;
     this.puntos = puntos;
 }

 public void aplicarBonificacion(CalculadoraBonificacion calculadora) {
     puntos += calculadora.calcular(puntos);
 }

 public int getPuntos() {
     return puntos;
 }

 @Override
 public String toString() {
     return nombre + " tiene " + puntos + " puntos.";
 }
}

