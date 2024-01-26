/*
 */
package lab2p2_davidoliva;

import java.util.Date;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
class ConferenciasVirtuales {

    private String TituloConfe;
    private String Conferencista;
    private Date FechaConfe;
    private String DuracionConfe;
    private String EnlaceAccesoConfe;

    public ConferenciasVirtuales() {
    }

    public ConferenciasVirtuales(String TituloConfe, String Conferencista, Date FechaConfe, String DuracionConfe, String EnlaceAccesoConfe) {
        this.TituloConfe = TituloConfe;
        this.Conferencista = Conferencista;
        this.FechaConfe = FechaConfe;
        this.DuracionConfe = DuracionConfe;
        this.EnlaceAccesoConfe = EnlaceAccesoConfe;
    }

    public String getTituloConfe() {
        return TituloConfe;
    }

    public void setTituloConfe(String TituloConfe) {
        this.TituloConfe = TituloConfe;
    }

    public String getConferencista() {
        return Conferencista;
    }

    public void setConferencista(String Conferencista) {
        this.Conferencista = Conferencista;
    }

    public Date getFechaConfe() {
        return FechaConfe;
    }

    public void setFechaConfe(Date FechaConfe) {
        this.FechaConfe = FechaConfe;
    }

    public String getDuracionConfe() {
        return DuracionConfe;
    }

    public void setDuracionConfe(String DuracionConfe) {
        this.DuracionConfe = DuracionConfe;
    }

    public String getEnlaceAccesoConfe() {
        return EnlaceAccesoConfe;
    }

    public void setEnlaceAccesoConfe(String EnlaceAccesoConfe) {
        this.EnlaceAccesoConfe = EnlaceAccesoConfe;
    }

    @Override
    public String toString() {
        return "ConferenciasVirtuales{" + "TituloConfe=" + TituloConfe + ", Conferencista=" + Conferencista + ", FechaConfe=" + FechaConfe + ", DuracionConfe=" + DuracionConfe + ", EnlaceAccesoConfe=" + EnlaceAccesoConfe + '}';
    }

}
