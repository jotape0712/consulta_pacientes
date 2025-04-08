import java.util.ArrayList;

public class Paciente {
    private String nome;
    private String cpf;
    private ArrayList<Consulta> consultas;

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.consultas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }
}
