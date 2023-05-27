package com.example.projeto;

public class Traducao {

    private String lingua1;
    private String lingua2;

    public Traducao(String lingua1, String lingua2) {
        this.lingua1 = lingua1;
        this.lingua2 = lingua2;
    }

    public String traduzir(Conversao conversao) {
        return conversao.traduzir(lingua1, lingua2);
    }
}
