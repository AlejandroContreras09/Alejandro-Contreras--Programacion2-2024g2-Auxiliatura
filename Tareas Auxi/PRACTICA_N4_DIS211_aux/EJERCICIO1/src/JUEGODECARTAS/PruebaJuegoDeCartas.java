package JUEGODECARTAS;

public class PruebaJuegoDeCartas {
    public static void main(String[] args) {
        // Crear cartas
        Carta cartaNormal = new CartaNormal(7, "Corazones");
        CartaEspecial cartaEspecial = new CartaEspecial(1, "Espadas");

        // Jugar cartas
        cartaNormal.jugar();
        cartaEspecial.jugar();

        // Mostrar cartas
        cartaNormal.mostrarCarta();
        cartaEspecial.mostrarCarta();

        // Realizar acción especial
        cartaEspecial.realizarAccion();
    }
}
