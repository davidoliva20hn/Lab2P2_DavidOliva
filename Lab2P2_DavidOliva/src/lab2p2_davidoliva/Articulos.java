/*
 */
package lab2p2_davidoliva;

import java.util.Date;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
class Articulos {

    private String tituloArticul;
    private String AutorArticul;
    private String temaArticul;
    private String AñoDePublicacionArticul;
    private String AccesoLineaArticul;

    public Articulos() {
    }

    public Articulos(String tituloArticul, String AutorArticul, String temaArticul, String AñoDePublicacionArticul, String AccesoLineaArticul) {
        this.tituloArticul = tituloArticul;
        this.AutorArticul = AutorArticul;
        this.temaArticul = temaArticul;
        this.AñoDePublicacionArticul = AñoDePublicacionArticul;
        this.AccesoLineaArticul = AccesoLineaArticul;
    }

    public String getTituloArticul() {
        return tituloArticul;
    }

    public void setTituloArticul(String tituloArticul) {
        this.tituloArticul = tituloArticul;
    }

    public String getAutorArticul() {
        return AutorArticul;
    }

    public void setAutorArticul(String AutorArticul) {
        this.AutorArticul = AutorArticul;
    }

    public String getTemaArticul() {
        return temaArticul;
    }

    public void setTemaArticul(String temaArticul) {
        this.temaArticul = temaArticul;
    }

    public String getAñoDePublicacionArticul() {
        return AñoDePublicacionArticul;
    }

    public void setAñoDePublicacionArticul(String AñoDePublicacionArticul) {
        this.AñoDePublicacionArticul = AñoDePublicacionArticul;
    }

    public String getAccesoLineaArticul() {
        return AccesoLineaArticul;
    }

    public void setAccesoLineaArticul(String AccesoLineaArticul) {
        this.AccesoLineaArticul = AccesoLineaArticul;
    }

    @Override
    public String toString() {
        return "Articulos{" + "tituloArticul=" + tituloArticul + ", AutorArticul=" + AutorArticul + ", temaArticul=" + temaArticul + ", A\u00f1oDePublicacionArticul=" + AñoDePublicacionArticul + ", AccesoLineaArticul=" + AccesoLineaArticul + '}';
    }

}
