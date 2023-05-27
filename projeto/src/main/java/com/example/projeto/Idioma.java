package com.example.projeto;

public class Idioma {

    private String lingua;

    public String getLingua() {
        return lingua;
    }

    public void inglesLingua(String lingua1, String lingua2) {
        Traducao traducao = new Traducao(lingua1, lingua2);
        this.lingua = traducao.traduzir(new ConversaoIngles());
    }

    public void espanholLingua(String lingua1, String lingua2) {
        Traducao traducao = new Traducao(lingua1, lingua2);
        this.lingua = traducao.traduzir(new ConversaoEspanhol());
    }

    public void francesLingua(String lingua1, String lingua2) {
        Traducao traducao = new Traducao(lingua1, lingua2);
        this.lingua = traducao.traduzir(new ConversaoFrances());
    }

    public void coreanoLingua(String lingua1, String lingua2) {
        Traducao traducao = new Traducao(lingua1, lingua2);
        this.lingua = traducao.traduzir(new ConversaoCoreano());
    }

    public void coverterIdioma(String lingua1, String lingua2) {
        Traducao traducao = new Traducao(lingua1, lingua2);
        this.lingua = traducao.traduzir(new ConversaoIdioma());
    }
}
