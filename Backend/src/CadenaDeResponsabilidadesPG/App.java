package CadenaDeResponsabilidadesPG;

public class App {
    public static void main(String[] args){
        /*Suponiendo que al momento de que al área de créditos en
        un banco le llegue una petición donde el cliente solicite
        un crédito  y se envíe un pedido a los diferentes encargados de
        autorizarlo.
        -Si el monto no supera los 60000, entonces, el ejecutivo de
        cuenta puede aprobarlo
        -Si el monto está entre los 60000 y los 200000, entonces el
        gerente es quien lo aprueba
        -Si el monto se encuentra por encima de los 200000 lo aprueba el
        director
         */
        EmpleadoBanco empleado1= new EjecutivoCuenta();
        EmpleadoBanco empleado2 = new Gerente();
        EmpleadoBanco empleado3 = new Director();

        empleado2.setSigEmpleadoBanco(empleado3);
        empleado1.setSigEmpleadoBanco(empleado2);

        empleado1.procesarSolicitud(78000);
        empleado1.procesarSolicitud(999000);
    }
}
