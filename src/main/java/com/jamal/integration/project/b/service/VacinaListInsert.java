package com.jamal.integration.project.b.service;

import com.jamal.integration.project.b.dao.PostgresConnection;
import com.jamal.integration.project.b.model.Vacina;
import java.util.ArrayList;

public class VacinaListInsert {

    public void insertVacina() {

        ArrayList<Vacina> vacinas = new ArrayList<>();

        Vacina vacina1 = new Vacina("Norms", 2300, 56);
        Vacina vacina2 = new Vacina("CoronaLoe", 1241, 23);
        Vacina vacina3 = new Vacina("VacAll", 2015, 65);
        Vacina vacina4 = new Vacina("Noberas", 2099, 12);
        Vacina vacina5 = new Vacina("Vachina", 2018, 45);

        vacinas.add(vacina1);
        vacinas.add(vacina2);
        vacinas.add(vacina3);
        vacinas.add(vacina4);
        vacinas.add(vacina5);

        PostgresConnection app = new PostgresConnection();

        int countInserts = 0;

        for (int i = 0; i < vacinas.size(); i++) {
            app.insertVacina(vacinas.get(i));
            countInserts++;
        }

        System.out.println(countInserts + " Vacinas Inseridas.");

    }
}
