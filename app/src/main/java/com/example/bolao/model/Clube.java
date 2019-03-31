package com.example.bolao.model;

public class Clube {

    private String nome;
    private String sigla;
    private Integer id;
    private Integer classificacao;
    private Integer numPontos;
    private Integer numVitorias;
    private Integer numEmpates;
    private Integer numDerrotas;
    private Integer golsPro;
    private Integer golsContra;


    public Clube(){}

    public Clube(String nome, String sigla, Integer classificacao,
                 Integer numPontos, Integer numVitorias,
                 Integer numEmpates, Integer numDerrotas, Integer golsPro,
                 Integer golsContra) {

        this.nome = nome;
        this.sigla = sigla;
        this.classificacao = classificacao;
        this.numPontos = numPontos;
        this.numVitorias = numVitorias;
        this.numEmpates = numEmpates;
        this.numDerrotas = numDerrotas;
        this.golsPro = golsPro;
        this.golsContra = golsContra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }

    public Integer getNumPontos() {
        return numPontos;
    }

    public void setNumPontos(Integer numPontos) {
        this.numPontos = numPontos;
    }

    public Integer getNumVitorias() {
        return numVitorias;
    }

    public void setNumVitorias(Integer numVitorias) {
        this.numVitorias = numVitorias;
    }

    public Integer getNumEmpates() {
        return numEmpates;
    }

    public void setNumEmpates(Integer numEmpates) {
        this.numEmpates = numEmpates;
    }

    public Integer getNumDerrotas() {
        return numDerrotas;
    }

    public void setNumDerrotas(Integer numDerrotas) {
        this.numDerrotas = numDerrotas;
    }

    public Integer getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(Integer golsPro) {
        this.golsPro = golsPro;
    }

    public Integer getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(Integer golsContra) {
        this.golsContra = golsContra;
    }
}
