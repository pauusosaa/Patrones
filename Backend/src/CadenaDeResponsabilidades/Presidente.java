package CadenaDeResponsabilidades;

public class Presidente extends EmpleadoGob{

    private final int tipoDeAcceso = 3;


    @Override
    public void leerDocumento(Documento documento) {
        System.out.println("Este documento lo esta leyendo un Presidente y dice: " + documento.getContenido());
    }


    @Override
    public void procesarMensaje(Documento documento) {
        if (documento.isEstaAutorizado()) {
            if (documento.getLecturas().get("Presidente") == Boolean.TRUE) {
                System.out.println("Fue leído por todos!");
            } else {
                if ((documento.getTipo() == tipoDeAcceso || documento.getTipo() <= tipoDeAcceso) && documento.getLecturas().get("Presidente")==null) {
                    this.leerDocumento(documento);
                    documento.addLectura("Presidente", Boolean.TRUE);
                }
                if (getSiguienteEmpleadoGob() != null) {
                    getSiguienteEmpleadoGob().procesarMensaje(documento);
                }
            }
        }else {
            System.out.println("El mensaje no puede ser leido! Debería estar autorizado");
        }
    }

}
