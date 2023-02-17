public class Paquete {

    private String identificacionPaquete;
    private String tipoPaquete;
    private int peso;
    private long valorDeclarado;

    public Paquete(String identificacionPaquete, String tipoPaquete, int peso, long valorDeclarado) {
        this.identificacionPaquete = identificacionPaquete;
        this.tipoPaquete = tipoPaquete;
        this.peso = peso;
        this.valorDeclarado = valorDeclarado;
    }

    public String getIdentificacionPaquete() {
        return identificacionPaquete;
    }

    public void setIdentificacionPaquete(String identificacionPaquete) {
        this.identificacionPaquete = identificacionPaquete;
    }

    public String getTipoPaquete() {
        return tipoPaquete;
    }

    public void setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public long getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(long valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }
}
