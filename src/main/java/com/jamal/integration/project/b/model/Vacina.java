package com.jamal.integration.project.b.model;

public class Vacina {

    private String nome;
    private int ano;
    private int imunidade_duracao;

    public Vacina(String nome, int ano, int imunidade_duracao) {
        this.nome = nome;
        this.ano = ano;
        this.imunidade_duracao = imunidade_duracao;
    }

    public Vacina() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getImunidade_duracao() {
        return imunidade_duracao;
    }

    public void setImunidade_duracao(int imunidade_duracao) {
        this.imunidade_duracao = imunidade_duracao;
    }

}
