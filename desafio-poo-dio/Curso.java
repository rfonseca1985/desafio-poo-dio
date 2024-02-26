// Classe Curso
public class Curso {
    private String nome;
    private String descricao;
    private int duracaoHoras;

    public Curso(String nome, String descricao, int duracaoHoras) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoHoras = duracaoHoras;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return int return the duracaoHoras
     */
    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    /**
     * @param duracaoHoras the duracaoHoras to set
     */
    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

}