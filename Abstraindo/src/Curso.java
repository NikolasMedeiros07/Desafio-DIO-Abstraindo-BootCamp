public class Curso {
    private String nome;
    private String descricao;
    private String instrutor;

    public Curso(String nome, String descricao, String instrutor) {
        this.nome = nome;
        this.descricao = descricao;
        this.instrutor = instrutor;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }
}
