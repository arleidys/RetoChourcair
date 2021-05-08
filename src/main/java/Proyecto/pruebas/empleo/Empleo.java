package Proyecto.pruebas.empleo;

public class Empleo {

    private  String nombreEmpleo;
    private  String descriptccionEmpleo;
    private String localidad ;

    public Empleo(String nombreEmpleo, String descriptccionEmpleo, String localidad) {
        this.nombreEmpleo=nombreEmpleo;
        this.descriptccionEmpleo=descriptccionEmpleo;
        this.localidad=localidad;
    }

    public String getNombreEmpleo() {
        return nombreEmpleo;
    }

    public void setNombreEmpleo(String nombreEmpleo) {
        this.nombreEmpleo=nombreEmpleo;
    }

    public String getDescriptccionEmpleo() {
        return descriptccionEmpleo;
    }

    public void setDescriptccionEmpleo(String descriptccionEmpleo) {
        this.descriptccionEmpleo=descriptccionEmpleo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad=localidad;
    }
}
