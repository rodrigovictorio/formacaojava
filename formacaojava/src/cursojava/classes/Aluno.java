package cursojava.classes;

/* Esta é a nossa classe/objeto que representa o aluno */
public class Aluno {

    // Esses são os ATRIBUTOS da classe Aluno
    String nome;
    int idade;
    String dataNascimento;
    String registroGeral;
    String numeroCpf;
    String nomeMae;
    String nomePai;
    String dataMatricula;
    String nomeEscola;
    String serieMatriculado;

    // Construtor
    public Aluno() { // Cria os dados na memória - Sendo padrão no Java

    }

    public Aluno(String nomePadrao) {
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }

}
