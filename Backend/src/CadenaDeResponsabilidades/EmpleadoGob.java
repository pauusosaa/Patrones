package CadenaDeResponsabilidades;

public abstract class EmpleadoGob {
    private EmpleadoGob siguienteEmpleadoGob;
    public abstract void procesarMensaje(Documento documento);
    public abstract void leerDocumento(Documento documento);

    public void setSiguienteEmpleadoGob(EmpleadoGob emp){
        siguienteEmpleadoGob = emp;
    }
    public EmpleadoGob getSiguienteEmpleadoGob(){ return siguienteEmpleadoGob;}

}
