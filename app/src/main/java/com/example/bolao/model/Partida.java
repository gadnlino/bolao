package com.example.bolao.model;

public class Partida {

    private String mandante;
    private Integer golsMandante;
    private String visitante;
    private Integer golsVisitante;
    private String localizacao;
    private String horario;//trocar para datetime
    private Integer id;

    public Partida() {
    }

    public Partida(String mandante, Integer golsMandante, String visitante,
                   Integer golsVisitante) {

        this.mandante = mandante;
        this.golsMandante = golsMandante;
        this.visitante = visitante;
        this.golsVisitante = golsVisitante;
    }

    public String getMandante() {
        return mandante;
    }

    public void setMandante(String mandante) {
        this.mandante = mandante;
    }

    public Integer getGolsMandante() {
        return golsMandante;
    }

    public void setGolsMandante(Integer golsMandante) {
        this.golsMandante = golsMandante;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public Integer getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(Integer golsVisitante) {
        this.golsVisitante = golsVisitante;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
