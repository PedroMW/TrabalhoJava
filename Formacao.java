

public class Formacao {
    private String titulo;
    private String nomecurso;
    private int cargHorCurso;


    public Formacao() {
        super();
    }

    public Formacao(String titulo, String nomecurso, int cargHorCurso) {
        this.titulo = titulo;
        this.nomecurso = nomecurso;
        this.cargHorCurso = cargHorCurso;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomecurso() {
        return this.nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public int getCargHorCurso() {
        return this.cargHorCurso;
    }

    public void setCargHorCurso(int cargHorCurso) {

        this.cargHorCurso = cargHorCurso;

    }


}
