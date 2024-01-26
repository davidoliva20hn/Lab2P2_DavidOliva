/*
 */
package lab2p2_davidoliva;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
class Usuario {

    String NombreUsuari;
    String ContraseñaUsuari;
    String TipoUsuario;

    public Usuario() {
    }

    public Usuario(String NombreUsuari, String ContraseñaUsuari, String TipoUsuario) {
        this.NombreUsuari = NombreUsuari;
        this.ContraseñaUsuari = ContraseñaUsuari;
        this.TipoUsuario = TipoUsuario;
    }

    public String getNombreUsuari() {
        return NombreUsuari;
    }

    public void setNombreUsuari(String NombreUsuari) {
        this.NombreUsuari = NombreUsuari;
    }

    public String getContraseñaUsuari() {
        return ContraseñaUsuari;
    }

    public void setContraseñaUsuari(String ContraseñaUsuari) {
        this.ContraseñaUsuari = ContraseñaUsuari;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "NombreUsuari=" + NombreUsuari + ", ContrasenaUsuari=" + ContraseñaUsuari + ", TipoUsuario=" + TipoUsuario + '}';
    }

}
