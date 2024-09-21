package ContarPalabrasPorLetra;

import java.util.List;

public class ContarPalabrasPorLetra {
    public static int contarPalabras(List<String> palabras, char letra) {
        int contador = 0;
        letra = Character.toLowerCase(letra); // Convertir letra a minúscula para ignorar mayúsculas
        for (String palabra : palabras) {
            if (palabra.toLowerCase().charAt(0) == letra) {
                contador++;
            }
        }
        return contador;
    }
}
