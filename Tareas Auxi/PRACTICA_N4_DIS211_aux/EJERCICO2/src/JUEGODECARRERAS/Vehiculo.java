package JUEGODECARRERAS;

//Clase abstracta Vehiculo
abstract class Vehiculo {
 protected String marca;
 protected String modelo;
 protected int velocidadMaxima;

 public Vehiculo(String marca, String modelo, int velocidadMaxima) {
     this.marca = marca;
     this.modelo = modelo;
     this.velocidadMaxima = velocidadMaxima;
 }

 // Método abstracto
 public abstract void acelerar();

 // Método mostrarInfo
 public void mostrarInfo() {
     System.out.println("Vehículo: " + marca + " " + modelo + " con velocidad máxima de " + velocidadMaxima + " km/h");
 }
}

//Interfaz Turbo
interface Turbo {
 void activarTurbo();
}
