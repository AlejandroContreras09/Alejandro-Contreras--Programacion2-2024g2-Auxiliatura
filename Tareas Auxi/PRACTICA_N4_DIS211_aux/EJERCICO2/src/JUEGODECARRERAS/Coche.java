package JUEGODECARRERAS;

//Clase Coche
class Coche extends Vehiculo {

 public Coche(String marca, String modelo, int velocidadMaxima) {
     super(marca, modelo, velocidadMaxima);
 }

 @Override
 public void acelerar() {
     System.out.println("El coche " + marca + " " + modelo + " está acelerando.");
 }
}

//Clase Moto que también implementa Turbo
class Moto extends Vehiculo implements Turbo {

 public Moto(String marca, String modelo, int velocidadMaxima) {
     super(marca, modelo, velocidadMaxima);
 }

 @Override
 public void acelerar() {
     System.out.println("La moto " + marca + " " + modelo + " está acelerando.");
 }

 @Override
 public void activarTurbo() {
     System.out.println("¡La moto " + marca + " " + modelo + " ha activado el turbo!");
 }
}
