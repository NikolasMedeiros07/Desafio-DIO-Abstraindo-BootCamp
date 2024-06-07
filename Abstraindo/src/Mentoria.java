public class Mentoria {
    private String tema;
    private String dataHora;
    private String mentor;

    public Mentoria(String tema, String dataHora, String mentor) {
        this.tema = tema;
        this.dataHora = dataHora;
        this.mentor = mentor;
    }

    // Getters e Setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }
}
