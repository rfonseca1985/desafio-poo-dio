// Classe Mentoria
public class Mentoria {
    private String tema;
    private String horario;

    public Mentoria(String tema, String horario) {
        this.tema = tema;
        this.horario = horario;
    }

    /**
     * @return String return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * @return String return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

}