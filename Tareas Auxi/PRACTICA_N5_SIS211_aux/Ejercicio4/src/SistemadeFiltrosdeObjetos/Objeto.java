package SistemadeFiltrosdeObjetos;

//Interfaz funcional para filtros de objetos
@FunctionalInterface
interface FiltroObjeto {
boolean filtrar(Objeto objeto);
}

//Clase que representa un objeto
class Objeto {
private String nombre;
private int peso;

public Objeto(String nombre, int peso) {
   this.nombre = nombre;
   this.peso = peso;
}

public int getPeso() {
   return peso;
}

public String getNombre() {
   return nombre;
}

@Override
public String toString() {
   return nombre + " (peso: " + peso + ")";
}
}