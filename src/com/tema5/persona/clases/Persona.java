package com.tema5.persona.clases;

public interface Persona {
    public abstract String getNombre();
    public abstract String getApellido1();
    public abstract String getApellido2();
    public default String [] getApellidos(){
        String  apellidos [] = {this.getApellido1(),this.getApellido2()};
        return apellidos;

    }
    public abstract Direccion getDirection();
    public abstract String getTelefono();
    public abstract EstadoCivil getEstadoCivil();
    public abstract Persona getPareja();
    public abstract int getEdad();


}
