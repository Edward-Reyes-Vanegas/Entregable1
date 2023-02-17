import java.time.LocalDateTime;

public class Envio {

    private String numeroGuia;
    private String estadoEnvio;
    private Cliente cliente;
    private Paquete paquete;
    private String ciudadOrigen;
    private String ciudadDestino;
    private String direccionDestino;
    private String nombreRecibe;
    private long celularRecibe;
    private long valorEnvio;
    private LocalDateTime horaEntrega;

    public Envio(String numeroGuia, String estadoEnvio, Cliente cliente, Paquete paquete, String ciudadOrigen, String ciudadDestino, String direccionDestino, String nombreRecibe, int celularRecibe, long valorEnvio, LocalDateTime horaEntrega) {
        this.numeroGuia = numeroGuia;
        this.estadoEnvio = estadoEnvio;
        this.cliente = cliente;
        this.paquete = paquete;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.direccionDestino = direccionDestino;
        this.nombreRecibe = nombreRecibe;
        this.celularRecibe = celularRecibe;
        this.valorEnvio = valorEnvio;
        this.horaEntrega = horaEntrega;
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getNombreRecibe() {
        return nombreRecibe;
    }

    public void setNombreRecibe(String nombreRecibe) {
        this.nombreRecibe = nombreRecibe;
    }

    public long getCelularRecibe() {
        return celularRecibe;
    }

    public void setCelularRecibe(long celularRecibe) {
        this.celularRecibe = celularRecibe;
    }

    public long getValorEnvio() {
        return valorEnvio;
    }

    public void setValorEnvio(long valorEnvio) {
        this.valorEnvio = valorEnvio;
    }

    public LocalDateTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalDateTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }
}
