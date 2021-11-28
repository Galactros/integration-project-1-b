package com.jamal.integration.project.b.service;

import com.jamal.integration.project.b.dao.PostgresConnection;
import com.jamal.integration.project.b.model.Paciente_Vacina;
import java.util.ArrayList;

public class VinculoListInsert {

    public void insertVinculo() {

        ArrayList<Paciente_Vacina> vinculos = new ArrayList<>();

        Paciente_Vacina vinculo1 = new Paciente_Vacina(1, 1, "2021-09-22");
        Paciente_Vacina vinculo2 = new Paciente_Vacina(1, 2, "2021-10-01");
        Paciente_Vacina vinculo3 = new Paciente_Vacina(3, 3, "2021-11-12");
        Paciente_Vacina vinculo4 = new Paciente_Vacina(4, 3, "2021-11-15");
        Paciente_Vacina vinculo5 = new Paciente_Vacina(2, 2, "2021-08-20");

        vinculos.add(vinculo1);
        vinculos.add(vinculo2);
        vinculos.add(vinculo3);
        vinculos.add(vinculo4);
        vinculos.add(vinculo5);

        PostgresConnection app = new PostgresConnection();

        int countInserts = 0;

        for (int i = 0; i < vinculos.size(); i++) {
            app.insertVinculos(vinculos.get(i));
            countInserts++;
        }

    }
}
