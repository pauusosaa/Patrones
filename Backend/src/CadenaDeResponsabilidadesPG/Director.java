package CadenaDeResponsabilidadesPG;

public class Director extends EmpleadoBanco{
    @Override
    public void procesarSolicitud(Integer monto) {
        if (monto>20000)
            System.out.println("Yo me encargo de gestionarlo!!, soy el Director");
        else if (getSigEmpleadoBanco() != null)
            getSigEmpleadoBanco().procesarSolicitud(monto);
    }
}
