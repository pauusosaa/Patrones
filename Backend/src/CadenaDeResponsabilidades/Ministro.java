package CadenaDeResponsabilidades;

public class Ministro extends EmpleadoGob{

    private final int tipoDeAcceso = 2;

    @Override
    public void leerDocumento(Documento documento) {
        System.out.println("Este documento lo esta leyendo un Ministro y dice: " + documento.getContenido());
    }

    @Override
    public void procesarMensaje(Documento documento) {
        if (documento.isEstaAutorizado()) {
            if(documento.getLecturas().get("Presidente") == Boolean.TRUE && documento.getLecturas().get("Ministro") == Boolean.TRUE){
                System.out.println("Fue leído por todos!");
            }else {
                if ((documento.getTipo() == tipoDeAcceso || documento.getTipo() <= tipoDeAcceso) && documento.getLecturas().get("Ministro")==null) {
                    this.leerDocumento(documento);
                    documento.addLectura("Ministro", Boolean.TRUE);
                }
                if (getSiguienteEmpleadoGob() != null) {
                    getSiguienteEmpleadoGob().procesarMensaje(documento);
                }
            }
        }else {
            System.out.println("Este mensaje no ha sido procesado, falta su autorización!");
        }
    }


}
