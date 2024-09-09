package Class;

public class Contacto {
    private String nombre;
    private String email;
    private int edad;
    private String celular;

    public Contacto(String nombre, String email, int edad, String celular) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    public String getCelular() {
        return celular;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Email: " + email + ", Edad: " + edad + ", Celular: " + celular;
    }
}
