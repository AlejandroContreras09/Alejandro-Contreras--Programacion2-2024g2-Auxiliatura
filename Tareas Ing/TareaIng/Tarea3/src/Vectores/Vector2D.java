package Vectores;

public class Vector2D {
    private double x;
    private double y;

    // Constructor
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método para sumar dos vectores
    public Vector2D sumar(Vector2D otro) {
        return new Vector2D(this.x + otro.x, this.y + otro.y);
    }

    // Método para restar dos vectores
    public Vector2D restar(Vector2D otro) {
        return new Vector2D(this.x - otro.x, this.y - otro.y);
    }

    // Método para multiplicar por un escalar
    public Vector2D multiplicar(double escalar) {
        return new Vector2D(this.x * escalar, this.y * escalar);
    }

    // Método para dividir por un escalar
    public Vector2D dividir(double escalar) {
        if (escalar != 0) {
            return new Vector2D(this.x / escalar, this.y / escalar);
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }

    // Sobrescribir toString para mostrar el vector
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(1, 2);

        // Ejemplos de uso
        Vector2D suma = v1.sumar(v2);
        Vector2D resta = v1.restar(v2);
        Vector2D multiplicacion = v1.multiplicar(2);
        Vector2D division = v1.dividir(2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación por escalar: " + multiplicacion);
        System.out.println("División por escalar: " + division);
    }
}
