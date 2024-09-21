package Boordeland;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SistemaBotin {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Map<String, Object>> inventario = new ArrayList<>();
        Random random = new Random();
        
        boolean continuar = true;
        while (continuar) {
            Map<String, Object> botin = generarBotin(random);
            imprimirBotin(botin);
            inventario.add(botin);

            System.out.println("\n¿Deseas enfrentarte a otro enemigo? (s/n): ");
            String respuesta = scanner.nextLine();
            continuar = respuesta.equalsIgnoreCase("s");
        }
        
        System.out.println("\nResumen del botín obtenido:");
        for (Map<String, Object> item : inventario) {
            imprimirBotin(item);
        }
        
        scanner.close();
    }
    
    public static Map<String, Object> generarBotin(Random random) {
        String[] tipos = {"Arma", "Escudo", "Modificador"};
        String[] rarezas = {"Común", "Poco Común", "Raro", "Épico", "Legendario"};
        
        String tipo = tipos[random.nextInt(tipos.length)];
        String rareza = rarezas[random.nextInt(rarezas.length)];
        
        Map<String, Object> botin = new HashMap<>();
        botin.put("tipo", tipo);
        botin.put("rareza", rareza);
        
        if (tipo.equals("Arma")) {
            int daño = 10 + random.nextInt(100);
            botin.put("atributo_1", "Daño: " + daño);
        } else if (tipo.equals("Escudo")) {
            int capacidad = 50 + random.nextInt(200);
            botin.put("atributo_1", "Capacidad de absorción: " + capacidad);
        } else if (tipo.equals("Modificador")) {
            String[] habilidades = {"Velocidad", "Resistencia", "Daño Crítico"};
            String habilidad = habilidades[random.nextInt(habilidades.length)];
            int mejora = 5 + random.nextInt(25);
            botin.put("atributo_1", habilidad + " mejorada en: " + mejora + "%");
        }
        
        return botin;
    }
    
    public static void imprimirBotin(Map<String, Object> botin) {
        System.out.println("Has obtenido un botín:");
        System.out.println("Tipo: " + botin.get("tipo"));
        System.out.println("Rareza: " + botin.get("rareza"));
        System.out.println("Atributo: " + botin.get("atributo_1"));
    }
}
