package com.jamal.integration.project.b.service;

import com.jamal.integration.project.b.dao.PostgresConnection;
import com.jamal.integration.project.b.model.Paciente;
import java.util.ArrayList;

public class PacienteListInsert {

    public void insertPaciente() {

        ArrayList<Paciente> pacientes = new ArrayList<>();

        Paciente paciente1 = new Paciente("Lara", 19, "Rua Caracol");
        Paciente paciente2 = new Paciente("Jamal", 25, "Avenida Louie");
        Paciente paciente3 = new Paciente("Rodos", 48, "Novantes Ares");
        Paciente paciente4 = new Paciente("Klaus", 182, "Infinito");

        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);

        PostgresConnection app = new PostgresConnection();

        int countInserts = 0;
        
        for (int i = 0; i < pacientes.size(); i++) {
            app.insertPaciente(pacientes.get(i));
            countInserts++;
            
        }

         System.out.println(countInserts + " Pacientes Inseridos.");
    }
}
