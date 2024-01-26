/*
 */
package lab2p2_davidoliva;

import java.util.Date;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
class Libros {

    private String tituloLibro;
    private String AutorLibro;
    private String generoLibro;
    private Date AñoDePublicacionLibro;
    private String DisponibilidadLibro;

    public Libros(String tituloLibro, String AutorLibro, String generoLibro, Date AñoDePublicacionLibro, String DisponibilidadLibro) {
        this.tituloLibro = tituloLibro;
        this.AutorLibro = AutorLibro;
        this.generoLibro = generoLibro;
        this.AñoDePublicacionLibro = AñoDePublicacionLibro;
        this.DisponibilidadLibro = DisponibilidadLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return AutorLibro;
    }

    public void setAutorLibro(String AutorLibro) {
        this.AutorLibro = AutorLibro;
    }

    public String getGeneroLibro() {
        return generoLibro;
    }

    public void setGeneroLibro(String generoLibro) {
        this.generoLibro = generoLibro;
    }

    public Date getAñoDePublicacionLibro() {
        return AñoDePublicacionLibro;
    }

    public void setAñoDePublicacionLibro(Date AñoDePublicacionLibro) {
        this.AñoDePublicacionLibro = AñoDePublicacionLibro;
    }

    public String getDisponibilidadLibro() {
        return DisponibilidadLibro;
    }

    public void setDisponibilidadLibro(String DisponibilidadLibro) {
        this.DisponibilidadLibro = DisponibilidadLibro;
    }

    @Override
    public String toString() {
        return "Libros{" + "tituloLibro=" + tituloLibro + ", AutorLibro=" + AutorLibro + ", generoLibro=" + generoLibro + ", A\u00f1oDePublicacionLibro=" + AñoDePublicacionLibro + ", DisponibilidadLibro=" + DisponibilidadLibro + '}';
    }

}
