import java.util.ArrayList;

public class Medico {
    private String nome;
    private int codigo;
    private ArrayList<Paciente> pacientes;

    public Medico(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.pacientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }
}
