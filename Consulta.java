public class Consulta {
    
    private String data;
    private String horario;
    private Paciente paciente;
    private Medico medico;

    public Consulta(String data, String horario, Paciente paciente, Medico medico) {
        this.data = data;
        this.horario = horario;
        this.paciente = paciente;
        this.medico = medico;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }
}
