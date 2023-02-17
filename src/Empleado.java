public class Empleado extends Persona {

    private String antiguedad;
    private String rh;
    private String tipoEmpleado;
    private DatosContacto datos;

    public Empleado(long cedula, String nombre, String apellido, String antiguedad, String rh, String tipoEmpleado, DatosContacto datos) {
        super(cedula, nombre, apellido);
        this.antiguedad = antiguedad;
        this.rh = rh;
        this.tipoEmpleado = tipoEmpleado;
        this.datos = datos;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public DatosContacto getDatos() {
        return datos;
    }

    public void setDatos(DatosContacto datos) {
        this.datos = datos;
    }
}
