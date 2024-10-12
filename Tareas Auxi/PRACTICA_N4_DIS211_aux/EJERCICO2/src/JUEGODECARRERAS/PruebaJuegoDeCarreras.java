package JUEGODECARRERAS;

public class PruebaJuegoDeCarreras {
    public static void main(String[] args) {
        // Crear vehículos
        Vehiculo coche = new Coche("Toyota", "Supra", 250);
        Moto moto = new Moto("Yamaha", "R1", 300);

        // Mostrar información y acelerar
        coche.mostrarInfo();
        coche.acelerar();

        moto.mostrarInfo();
        moto.acelerar();

        // Activar turbo en la moto
        moto.activarTurbo();
    }
}
