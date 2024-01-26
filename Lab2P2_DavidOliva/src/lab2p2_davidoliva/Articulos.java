/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_davidoliva;

import java.util.Date;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
class Articulos {

    private String titulo;
    private String Autor;
    private String tema;
    private Date AñoDePublicacion;
    private String AccesoLinea;

    public Articulos(String titulo, String Autor, String tema, Date AñoDePublicacion, String AccesoLinea) {
        this.titulo = titulo;
        this.Autor = Autor;
        this.tema = tema;
        this.AñoDePublicacion = AñoDePublicacion;
        this.AccesoLinea = AccesoLinea;
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

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getAñoDePublicacion() {
        return AñoDePublicacion;
    }

    public void setAñoDePublicacion(Date AñoDePublicacion) {
        this.AñoDePublicacion = AñoDePublicacion;
    }

    public String getAccesoLinea() {
        return AccesoLinea;
    }

    public void setAccesoLinea(String AccesoLinea) {
        this.AccesoLinea = AccesoLinea;
    }

    @Override
    public String toString() {
        return "Articulos{" + "titulo=" + titulo + ", Autor=" + Autor + ", tema=" + tema + ", A\u00f1oDePublicacion=" + AñoDePublicacion + ", AccesoLinea=" + AccesoLinea + '}';
    }

}
