package com.frescoplay.expresioneslamda;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    public enum Genero {
        HOMBRE,
        MUJER,
        NOBINARIO
    };

    private String nombre;
    private String apellido;
    private int edad;
    private Genero genero;
    private String correo;
    private String direccion;
    private String ciudad;

    public Persona(String nombre, String apellido, int edad, Genero genero, String correo, String direccion, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero + ", correo=" + correo + ", direccion=" + direccion + ", ciudad=" + ciudad + '}';
    }

    public static List<Persona> obtenerPersonas() {
        List<Persona> lPersonas = new ArrayList<>();
        lPersonas.add(new Persona("Edwin", "Porras", 45, Genero.HOMBRE, "asdf@sdf.com",
                "Calle de las Flores", "Chía"));
        lPersonas.add(new Persona("Pedro", "Perez", 22, Genero.NOBINARIO, "asdf@sdf.com",
                "Indefinida", "Bogota"));
        lPersonas.add(new Persona("Rodrigo", "Rodriguez", 5, Genero.HOMBRE, "asdf@sdf.com",
                "Calle XEYX", "Bucaramanga"));
        lPersonas.add(new Persona("Sahil", "Saha", 15, Genero.MUJER, "asdf@sdasdff.com",
                "Calle QAZ", "Cartagena"));
        lPersonas.add(new Persona("Yogesh", "Palt", 33, Genero.HOMBRE, "asdgfasdf@sdasdff.com",
                "Calle WSX", "Santa Marta"));
        lPersonas.add(new Persona("Rohit", "Sahin", 77, Genero.HOMBRE, "aasfasdfasdf@syjkdghdf.com",
                "Calle EDC", "Bogota"));
        lPersonas.add(new Persona("Mery", "Rodriguez", 16, Genero.MUJER, "aasfasdfasdf@syjkdghdf.com",
                "Calle RFV", "Bogota"));
        lPersonas.add(new Persona("Aida", "Torres", 62, Genero.MUJER, "aasfa54654sdfasdf@syjkdghdf.com",
                "Calle TGB", "Bogota"));

        return lPersonas;
    }

}
