package com.jamal.integration.project.b;

import com.jamal.integration.project.b.service.PacienteListInsert;
import com.jamal.integration.project.b.service.VacinaListInsert;

public class Main {

    public static void main(String[] args) {

        PacienteListInsert insertListPacientes = new PacienteListInsert();

        VacinaListInsert insertListVacinas = new VacinaListInsert();

        insertListPacientes.insertPaciente();
        insertListVacinas.insertVacina();
    }
}
