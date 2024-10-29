package SistemadeFiltrosdeObjetos;

import java.util.ArrayList;
import java.util.List;

//Clase que representa un inventario
class Inventario {
private List<Objeto> objetos;

public Inventario() {
   this.objetos = new ArrayList<>();
}

public void agregarObjeto(Objeto objeto) {
   objetos.add(objeto);
}

public List<Objeto> filtrarObjetos(FiltroObjeto filtro) {
   List<Objeto> resultado = new ArrayList<>();
   for (Objeto objeto : objetos) {
       if (filtro.filtrar(objeto)) {
           resultado.add(objeto);
       }
   }
   return resultado;
}
}
