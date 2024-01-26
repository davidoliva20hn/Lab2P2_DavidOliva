/*
 */
package lab2p2_davidoliva;

import java.util.Date;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
class Libros {
    private String titulo;
    private String Autor;
    private String genero;
    private Date AñoDePublicacion;
    private String Disponibilidad;

    public Libros(String titulo, String Autor, String genero, Date AñoDePublicacion, String Disponibilidad) {
        this.titulo = titulo;
        this.Autor = Autor;
        this.genero = genero;
        this.AñoDePublicacion = AñoDePublicacion;
        this.Disponibilidad = Disponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getAñoDePublicacion() {
        return AñoDePublicacion;
    }

    public void setAñoDePublicacion(Date AñoDePublicacion) {
        this.AñoDePublicacion = AñoDePublicacion;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + ", Autor=" + Autor + ", genero=" + genero + ", A\u00f1oDePublicacion=" + AñoDePublicacion + ", Disponibilidad=" + Disponibilidad + '}';
    }
    
    
    
}
