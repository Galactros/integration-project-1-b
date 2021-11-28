package com.jamal.integration.project.b;

import com.jamal.integration.project.b.service.PacienteListInsert;
import com.jamal.integration.project.b.service.VacinaListInsert;
import com.jamal.integration.project.b.service.VinculoListInsert;

public class Main {

    public static void main(String[] args) {

        PacienteListInsert insertListPacientes = new PacienteListInsert();

        VacinaListInsert insertListVacinas = new VacinaListInsert();

        VinculoListInsert insertviculos = new VinculoListInsert();

        insertListPacientes.insertPaciente();
        insertListVacinas.insertVacina();
        insertviculos.insertVinculo();
    }
}
