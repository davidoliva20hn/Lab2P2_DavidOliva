/*
 */
package lab2p2_davidoliva;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
class CursosLinea {

    private String tituloCurso;
    private String instructorCurso;
    private String DuracionEnSemanaCurso;
    private String PlataformaEnseñaCurso;

    public CursosLinea(String tituloCurso, String instructorCurso, String DuracionEnSemanaCurso, String PlataformaEnseñaCurso) {
        this.tituloCurso = tituloCurso;
        this.instructorCurso = instructorCurso;
        this.DuracionEnSemanaCurso = DuracionEnSemanaCurso;
        this.PlataformaEnseñaCurso = PlataformaEnseñaCurso;
    }

    public String getTituloCurso() {
        return tituloCurso;
    }

    public void setTituloCurso(String tituloCurso) {
        this.tituloCurso = tituloCurso;
    }

    public String getInstructorCurso() {
        return instructorCurso;
    }

    public void setInstructorCurso(String instructorCurso) {
        this.instructorCurso = instructorCurso;
    }

    public String getDuracionEnSemanaCurso() {
        return DuracionEnSemanaCurso;
    }

    public void setDuracionEnSemanaCurso(String DuracionEnSemanaCurso) {
        this.DuracionEnSemanaCurso = DuracionEnSemanaCurso;
    }

    public String getPlataformaEnseñaCurso() {
        return PlataformaEnseñaCurso;
    }

    public void setPlataformaEnseñaCurso(String PlataformaEnseñaCurso) {
        this.PlataformaEnseñaCurso = PlataformaEnseñaCurso;
    }

    @Override
    public String toString() {
        return "CursosLinea{" + "tituloCurso=" + tituloCurso + ", instructorCurso=" + instructorCurso + ", DuracionEnSemanaCurso=" + DuracionEnSemanaCurso + ", PlataformaEnse\u00f1aCurso=" + PlataformaEnseñaCurso + '}';
    }

}
