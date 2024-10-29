package SistemadeFiltrosdeObjetos;

import java.util.List;

//Clase principal para demostrar el uso
public class MainFiltros {
 public static void main(String[] args) {
     Inventario inventario = new Inventario();
     inventario.agregarObjeto(new Objeto("Scar", 5));
     inventario.agregarObjeto(new Objeto("Escudo", 3));
     inventario.agregarObjeto(new Objeto("Botequin", 1));
     inventario.agregarObjeto(new Objeto("Granada de Choque", 6));

     List<Objeto> objetosPesados = inventario.filtrarObjetos(objeto -> objeto.getPeso() >= 1);
     
     System.out.println("Objetos pesados:");
     for (Objeto objeto : objetosPesados) {
         System.out.println(objeto);
     }
 }
}
