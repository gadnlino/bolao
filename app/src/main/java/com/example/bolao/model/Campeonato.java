package com.example.bolao.model;

public class Campeonato {

    private String nome;
    private String pais;
    private String temporada;
    private Integer id;


    public Campeonato(){}

    public Campeonato(String nome,String pais,String temporada){
        this.setTemporada(temporada);
        this.setPais(pais);
        this.setNome(nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
}
