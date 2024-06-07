public class Main {
    public static void main(String[] args) {
        // Criando alguns cursos
        Curso cursoJava = new Curso("Java", "Curso de programação em Java", "João");
        Curso cursoPython = new Curso("Python", "Curso de programação em Python", "Maria");

        // Criando algumas mentorias
        Mentoria mentorJava = new Mentoria("Desenvolvimento em Java", "2024-06-07 10:00", "José");
        Mentoria mentorPython = new Mentoria("Desenvolvimento em Python", "2024-06-08 15:00", "Ana");

        // Criando alguns devs
        Devs dev1 = new Devs("Carlos", "carlos@example.com", "Júnior");
        Devs dev2 = new Devs("Ana", "ana@example.com", "Pleno");

        // Criando um bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp de Programação");

        // Adicionando cursos, mentorias e devs ao bootcamp
        bootcamp.adicionarCurso(cursoJava);
        bootcamp.adicionarCurso(cursoPython);
        bootcamp.adicionarMentoria(mentorJava);
        bootcamp.adicionarMentoria(mentorPython);
        bootcamp.adicionarDev(dev1);
        bootcamp.adicionarDev(dev2);

        // Exibindo informações do bootcamp
        System.out.println("Nome do Bootcamp: " + bootcamp.getNome());
        System.out.println("Cursos do Bootcamp:");
        for (Curso curso : bootcamp.getCursos()) {
            System.out.println("  - " + curso.getNome() + " | Instrutor: " + curso.getInstrutor());
        }
        System.out.println("Mentorias do Bootcamp:");
        for (Mentoria mentoria : bootcamp.getMentorias()) {
            System.out.println("  - " + mentoria.getTema() + " | Mentor: " + mentoria.getMentor() + " | Data e Hora: " + mentoria.getDataHora());
        }
        System.out.println("Devs do Bootcamp:");
        for (Devs dev : bootcamp.getDevs()) {
            System.out.println("  - " + dev.getNome() + " | Email: " + dev.getEmail() + " | Nível: " + dev.getNivel());
        }
    }
}
