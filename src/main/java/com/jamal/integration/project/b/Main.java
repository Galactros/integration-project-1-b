package com.jamal.integration.project.b;

import com.jamal.integration.project.b.dao.PostgresConnection;
import com.jamal.integration.project.b.model.Paciente;
import com.jamal.integration.project.b.model.Vacina;

public class Main {

    public static void main(String[] args) {

        PostgresConnection app = new PostgresConnection();

        Paciente paciente = new Paciente("Jamal", 15, "Rusaa ajas 823, daisj213 sdsadsad");

        Vacina vacina = new Vacina("Border", 2018, 45);

        app.insertPaciente(paciente);
        app.insertVacina(vacina);

        System.out.println(
                String.format("Paciente %s inserido com a vacina %s", paciente.getNome(), vacina.getNome()));
    }
}
