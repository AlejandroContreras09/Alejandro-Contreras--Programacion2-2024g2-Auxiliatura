package JUEGODESIMULACIONDEGRANJAS;

//Clase abstracta Animal
abstract class Animal {
 protected String nombre;
 protected int edad;

 public Animal(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }

 // Método abstracto
 public abstract void hacerSonido();

 // Método mostrarInfo
 public void mostrarInfo() {
     System.out.println("Animal: " + nombre + ", Edad: " + edad + " años");
 }
}

//Interfaz Productor
interface Productor {
 void producir();
}
