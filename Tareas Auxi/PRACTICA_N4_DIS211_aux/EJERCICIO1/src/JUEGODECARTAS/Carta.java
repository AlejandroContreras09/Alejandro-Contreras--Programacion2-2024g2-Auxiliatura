package JUEGODECARTAS;

//Clase abstracta Carta
abstract class Carta {
 protected int valor;
 protected String palo;

 public Carta(int valor, String palo) {
     this.valor = valor;
     this.palo = palo;
 }

 // Método abstracto
 public abstract void jugar();

 // Método mostrarCarta
 public void mostrarCarta() {
     System.out.println("Carta: " + valor + " de " + palo);
 }
}

//Interfaz Accionable
interface Accionable {
 void realizarAccion();
}
