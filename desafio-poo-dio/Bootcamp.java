// Classe Bootcamp

import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private List<Curso> cursos;
    private List<Mentoria> mentorias;
    private List<Devs> participantes;

    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.participantes = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void adicionarParticipante(Devs dev) {
        participantes.add(dev);
    }

}