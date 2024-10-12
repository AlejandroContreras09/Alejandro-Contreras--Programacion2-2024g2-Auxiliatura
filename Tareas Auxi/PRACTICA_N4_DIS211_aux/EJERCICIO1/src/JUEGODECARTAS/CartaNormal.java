package JUEGODECARTAS;

//Clase CartaNormal
class CartaNormal extends Carta {

 public CartaNormal(int valor, String palo) {
     super(valor, palo);
 }

 @Override
 public void jugar() {
     System.out.println("Carta normal jugada: " + valor + " de " + palo);
 }
}

//Clase CartaEspecial que también implementa Accionable
class CartaEspecial extends Carta implements Accionable {

 public CartaEspecial(int valor, String palo) {
     super(valor, palo);
 }

 @Override
 public void jugar() {
     System.out.println("Carta especial jugada: " + valor + " de " + palo);
 }

 @Override
 public void realizarAccion() {
     System.out.println("¡Acción especial realizada por la carta " + valor + " de " + palo + "!");
 }
}
