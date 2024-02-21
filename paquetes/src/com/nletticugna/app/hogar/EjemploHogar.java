package com.nletticugna.app.hogar;

import com.nletticugna.app.jardin.Perro;

import static com.nletticugna.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
