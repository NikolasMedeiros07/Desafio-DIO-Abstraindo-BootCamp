public class Devs {
    private String nome;
    private String email;
    private String nivel;

    public Devs(String nome, String email, String nivel) {
        this.nome = nome;
        this.email = email;
        this.nivel = nivel;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
