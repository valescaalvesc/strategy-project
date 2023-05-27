package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class IdiomaTest {

    @Test
    void deveConverterIdiomaIngles() {
        Idioma idioma = new Idioma();
        idioma.inglesLingua("coreano", "ingles");
        assertEquals("ingles", idioma.getLingua());
    }

    @Test
    void deveConverterIdiomaEspanhol() {
        Idioma idioma = new Idioma();
        idioma.espanholLingua("ingles", "espanhol");
        assertEquals("espanhol", idioma.getLingua());
    }

    @Test
    void deveConverterIdiomaFrances() {
        Idioma idioma = new Idioma();
        idioma.francesLingua("ingles", "frances");
        assertEquals("frances", idioma.getLingua());
    }

    @Test
    void deveConverterIdiomaCoreano() {
        Idioma idioma = new Idioma();
        idioma.coreanoLingua("frances", "coreano");
        assertEquals("coreano", idioma.getLingua());
    }


    @Test
    void deveCalcularMediaNotaAluno() {
        Idioma idioma = new Idioma();
        idioma.coverterIdioma("ingles", "frances");
        assertEquals("inglesfrances", idioma.getLingua());
    }
}
