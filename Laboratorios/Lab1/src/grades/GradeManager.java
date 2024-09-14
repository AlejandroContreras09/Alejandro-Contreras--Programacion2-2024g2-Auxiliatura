package grades;

import java.util.ArrayList;

public class GradeManager {
    
    private ArrayList<Double> grades;

    public GradeManager() {
        grades = new ArrayList<>();
    }

    public void addGrade(Double grade) {
        grades.add(grade);
    }

    public Double calculateAverage() {
        Double sum = 0.0;
        for (Double grade : grades) {
            sum += grade;
        }
        return grades.isEmpty() ? 0.0 : sum / grades.size();
    }

    public Integer countPassingGrades() {
        Integer count = 0;
        for (Double grade : grades) {
            if (grade >= 50.0) {
                count++;
            }
        }
        return count;
    }
      
    // Método para eliminar una nota por valor
    public boolean removeGradeByValue(Double grade) {
        return grades.remove(grade); // Devuelve true si la nota fue eliminada, false si no se encontró
    }

    // Método para eliminar una nota por posición
    public boolean removeGradeByIndex(int index) {
        if (index >= 0 && index < grades.size()) {
            grades.remove(index);
            return true; // La eliminación fue exitosa
        }
        return false; // La posición es inválida
    }

    // Método para mostrar todas las notas
    public void showAllGrades() {
        System.out.println("Current grades: " + grades);
    }
}
