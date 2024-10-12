package JUEGODESIMULACIONDEGRANJAS;

//Clase Vaca que implementa Productor
class Vaca extends Animal implements Productor {

 public Vaca(String nombre, int edad) {
     super(nombre, edad);
 }

 @Override
 public void hacerSonido() {
     System.out.println(nombre + " hace: ¡Muuuuu!");
 }

 @Override
 public void producir() {
     System.out.println(nombre + " está produciendo leche.");
 }
}

//Clase Oveja que implementa Productor
class Oveja extends Animal implements Productor {

 public Oveja(String nombre, int edad) {
     super(nombre, edad);
 }

 @Override
 public void hacerSonido() {
     System.out.println(nombre + " hace: ¡Beeee!");
 }

 @Override
 public void producir() {
     System.out.println(nombre + " está produciendo lana.");
 }
}
