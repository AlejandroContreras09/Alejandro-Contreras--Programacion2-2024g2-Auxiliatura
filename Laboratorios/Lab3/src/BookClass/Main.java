package BookClass;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Gabriel García Márquez");

        // Agregar libros usando el método addBook con objeto Book
        Book book1 = new Book("Cien años de soledad", author, 29.99);
        author.addBook(book1);

        // Agregar libros usando el método addBook sobrecargado
        author.addBook("El amor en los tiempos del cólera", 19.99);

        // Mostrar información de los libros
        for (Book book : author.getBooks()) {
            System.out.println(book.getInfo());
        }
    }
}
