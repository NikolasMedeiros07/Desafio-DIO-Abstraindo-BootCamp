import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private List<Curso> cursos;
    private List<Mentoria> mentorias;
    private List<Devs> devs;

    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    // Métodos para gerenciar cursos
    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }

    // Métodos para gerenciar mentorias
    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void removerMentoria(Mentoria mentoria) {
        mentorias.remove(mentoria);
    }

    // Métodos para gerenciar devs
    public void adicionarDev(Devs dev) {
        devs.add(dev);
    }

    public void removerDev(Devs dev) {
        devs.remove(dev);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(List<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    public List<Devs> getDevs() {
        return devs;
    }

    public void setDevs(List<Devs> devs) {
        this.devs = devs;
    }
}
