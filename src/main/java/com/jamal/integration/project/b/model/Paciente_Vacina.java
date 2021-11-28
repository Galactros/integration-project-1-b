package com.jamal.integration.project.b.model;

public class Paciente_Vacina {

    private int id_paciente;
    private int id_vacina;
    private String vacinacao_date;

    public Paciente_Vacina(int id_paciente, int id_vacina, String vacinacao_date) {
        this.id_paciente = id_paciente;
        this.id_vacina = id_vacina;
        this.vacinacao_date = vacinacao_date;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public int getId_vacina() {
        return id_vacina;
    }

    public void setId_vacina(int id_vacina) {
        this.id_vacina = id_vacina;
    }

    public String getVacinacao_date() {
        return vacinacao_date;
    }

    public void setVacinacao_date(String vacinacao_date) {
        this.vacinacao_date = vacinacao_date;
    }

}
