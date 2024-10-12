package JUEGODESIMULACIONDEGRANJAS;

public class PruebaSimulacionGranjas {
    public static void main(String[] args) {
        // Crear animales
        Vaca vaca = new Vaca("Lola", 5);
        Oveja oveja = new Oveja("Dolly", 3);

        // Mostrar información y sonidos
        vaca.mostrarInfo();
        vaca.hacerSonido();
        vaca.producir();

        oveja.mostrarInfo();
        oveja.hacerSonido();
        oveja.producir();
    }
}
