import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Cria MEDICOS
        Medico medico1 = new Medico("Dr. Joao Pedro", 1);
        Medico medico2 = new Medico("Dr. André", 2);

        // Cria PACIENTES
        Paciente paciente1 = new Paciente("Luana", "12345678900");
        Paciente paciente2 = new Paciente("Andressa", "98765432100");

        // Cria CONSULTAS
        Consulta consulta1 = new Consulta("07/04/2072", "14:99", paciente1, medico1);
        Consulta consulta2 = new Consulta("07/04/2025", "23:30", paciente2, medico2);

        // Vincula os PACIENTES aos MEDICOS
        medico1.adicionarPaciente(paciente1);
        medico2.adicionarPaciente(paciente2);

        // Vincula CONSULTAS aos pacientes
        paciente1.adicionarConsulta(consulta1);
        paciente2.adicionarConsulta(consulta2);

        // Mostra as CONSULTAS
        ArrayList<Consulta> consultas = new ArrayList<>();
        consultas.add(consulta1);
        consultas.add(consulta2);


        System.out.println("Consultas registradas:");
        for (Consulta c : consultas) {
            System.out.println("Data: " + c.getData() +
                ", Horário: " + c.getHorario() +
                ", Paciente: " + c.getPaciente().getNome() +
                ", Médico: " + c.getMedico().getNome());
        }
    }
}
