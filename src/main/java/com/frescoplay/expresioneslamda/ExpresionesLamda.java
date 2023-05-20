package com.frescoplay.expresioneslamda;

import java.util.List;

public class ExpresionesLamda {
    
    public static void main(String[] args) {
        System.out.println("Personas mayores de 18 años -->");
        //IPersona<Persona> filtro18 = ((p) -> p.getEdad() > 18);
/*        
        personasPorEdades((Persona p) -> p.getEdad() > 18);

        System.out.println("Personas mayores de 60 años -->");
        IPersona<Persona> filtro60 = ((p) -> p.getEdad() > 60);
        personasPorEdades(filtro60);

        System.out.println("Personas entre 24 y 35 años -->");
        IPersona<Persona> filtroRango24_35 = ((p) -> p.getEdad() > 24
                && p.getEdad() < 35);
        personasPorEdades(filtroRango24_35);

        System.out.println("Personas 35 y 40 años y Hombre -->");
        IPersona<Persona> filtroRango35_40_H = ((p) -> (p.getEdad() > 35
                && p.getEdad() < 50) 
                && p.getGenero().equals(Persona.Genero.HOMBRE) );
        personasPorEdades(filtroRango35_40_H);
         */
        
        Persona.obtenerPersonas().stream()
                .filter(p -> p.getEdad() > 18)
                .forEach(e -> System.out.println(e));
        
        System.out.println("Otro");
        
        Persona.obtenerPersonas().stream()
                .filter(p -> p.getEdad() > 18)
                .filter(p -> p.getEdad() < 30)
                .filter(p -> p.getGenero().equals(Persona.Genero.HOMBRE))
                .forEach(ExpresionesLamda::enviarEmail);
        
    }
    
    public static void personasPorEdades(IPersona p) {
        List<Persona> lPersonas = Persona.obtenerPersonas();
        for (Persona lPersona : lPersonas) {
            if (p.analizar(lPersona)) {
                System.out.println(lPersona);
            }
        }
    }
    
    public static void enviarEmail(Persona p) {
        System.out.println("Se ha enviado el email a: " + p.getCorreo());
    }
}
