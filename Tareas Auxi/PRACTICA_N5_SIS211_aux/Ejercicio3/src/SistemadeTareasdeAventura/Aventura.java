package SistemadeTareasdeAventura;

import java.util.ArrayList;
import java.util.List;

//Interfaz funcional para tareas
@FunctionalInterface
interface Tarea {
 void ejecutar();
}

//Clase que representa una aventura
class Aventura {
 private List<Tarea> tareas;

 public Aventura() {
     this.tareas = new ArrayList<>();
 }

 public void agregarTarea(Tarea tarea) {
     tareas.add(tarea);
 }

 public void iniciar() {
     for (Tarea tarea : tareas) {
         tarea.ejecutar();
     }
 }
}

