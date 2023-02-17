import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        DatosContacto datosCliente=new DatosContacto(3194476307L, "ereyes78@gmail.com", "calle 77#13-47", "Bogota");
        DatosContacto datosEmpleado=new DatosContacto(3112622933L, "jinethcano@gmail.com", "calle 24#20-20", "Bucaramanga");
        DatosContacto datosCliente2=new DatosContacto(3141234567L, "blblabla@gmail.com", "calle 53#30-21", "Barranquilla");
        DatosContacto datosEmpleado2=new DatosContacto(321786543, "nicoingles@hotmail.com", "carrera 11#20-20", "cartagena");

        Cliente cliente1=new Cliente(12345678,"hhhhhhhh","jhfjdshfjd", datosCliente);
        Empleado empleado1=new Empleado(98765436, "jjgbjhdjjhkhwsdf", "nhgjhkjnkjnjkljmk","2 años", "A+", "REPARTIDOR", datosEmpleado);
        Cliente cliente2=new Cliente(78901234,"jjjjjjjjj","ppppppppp", datosCliente2);
        Empleado empleado2=new Empleado(67890123, "Mariana", "Ariza","5 años", "A+", "Bodega", datosEmpleado2);
        //creando paquetes.
        Paquete paquete1=new Paquete("ABCDE12345","lIVIANO", 20, 20000);

        //CREANDO ENVIOS
        LocalDateTime hora=LocalDateTime.now();
        Envio envio1=new Envio("xxxxx","EN BODEGA",cliente1,paquete1,"MEDELLIN","BOGOTA","DESTINO","MARIA",76543219,50000,hora);

        //MOSTRANDO CLIENTES1

        System.out.println("ESTE ES CLIENTE1: \n");
        System.out.println("IDENTIFICACION:" +cliente1.getCedula());
        System.out.println("NOMBRE:  "+cliente1.getNombre());
        System.out.println("APELLIDO: "+cliente1.getApellido());
        System.out.println("\n");

        //MOSTRANDO EMPLEADO1

        System.out.println("ESTE ES EMPLEADO 1: \n");
        System.out.println("IDENTIFICACION:" +empleado1.getCedula());
        System.out.println("NOMBRE:  "+empleado1.getNombre());
        System.out.println("APELLIDO: "+empleado1.getApellido());
        System.out.println("ANTIGUEDAD: "+empleado1.getAntiguedad());
        System.out.println("RH: "+empleado1.getRh());
        System.out.println("TIPO DEL EMPLEADO: "+empleado1.getTipoEmpleado());
        System.out.println("DATOS CONTACTO: "+empleado1.getDatos().getCiudad()+"  "+empleado1.getDatos().getDireccion()+"  "+empleado1.getDatos().getCorreoElectronico()+"  "+empleado1.getDatos().getCelular());


    }
}