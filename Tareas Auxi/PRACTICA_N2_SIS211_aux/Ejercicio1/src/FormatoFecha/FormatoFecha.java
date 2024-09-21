package FormatoFecha;

import java.util.HashMap;
import java.util.Scanner;

public class FormatoFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> meses = new HashMap<>();
        meses.put("enero", 31);
        meses.put("febrero", 28); // No considerando años bisiestos en este caso
        meses.put("marzo", 31);
        meses.put("abril", 30);
        meses.put("mayo", 31);
        meses.put("junio", 30);
        meses.put("julio", 31);
        meses.put("agosto", 31);
        meses.put("septiembre", 30);
        meses.put("octubre", 31);
        meses.put("noviembre", 30);
        meses.put("diciembre", 31);
        
        System.out.println("Introduce la fecha en formato 'día de mes, año': ");
        String entrada = sc.nextLine().toLowerCase();
        sc.close();

        try {
            String[] partes = entrada.split(" de ");
            int dia = Integer.parseInt(partes[0].trim());
            String mes = partes[1].split(",")[0].trim();
            int año = Integer.parseInt(partes[1].split(",")[1].trim());
            
            if (!meses.containsKey(mes)) {
                System.out.println("Mes inválido.");
                return;
            }

            int diasEnMes = meses.get(mes);
            if (mes.equals("febrero") && año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                diasEnMes = 29; // Año bisiesto
            }

            if (dia > diasEnMes || dia < 1) {
                System.out.println("Fecha inválida.");
            } else {
                String mesNum = String.format("%02d", meses.keySet().stream().toList().indexOf(mes) + 1);
                System.out.println(dia + " / " + mesNum + " / " + año);
            }
        } catch (Exception e) {
            System.out.println("Formato de entrada incorrecto.");
        }
    }
}
