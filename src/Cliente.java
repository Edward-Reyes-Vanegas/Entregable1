public class Cliente extends Persona {

    private DatosContacto datos;

    public Cliente(long cedula, String nombre, String apellido, DatosContacto datos) {
        super(cedula, nombre, apellido);
        this.datos = datos;
    }

    public DatosContacto getDatos() {
        return datos;
    }

    public void setDatos(DatosContacto datos) {
        this.datos = datos;
    }
}
