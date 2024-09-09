package Class;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** Menú de Contactos ***");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Ver contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Borrar contacto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Celular: ");
                    String celular = scanner.nextLine();
                    Contacto contacto = new Contacto(nombre, email, edad, celular);
                    agenda.agregarContacto(contacto);
                    break;
                case 2:
                    agenda.verContactos();
                    break;
                case 3:
                    System.out.print("Email del contacto a buscar: ");
                    email = scanner.nextLine();
                    agenda.buscarContacto(email);
                    break;
                case 4:
                    System.out.print("Email del contacto a eliminar: ");
                    email = scanner.nextLine();
                    agenda.borrarContacto(email);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
