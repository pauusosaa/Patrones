package CadenaDeResponsabilidades;

public class App {
    public static void main(String[] args){
        /*=================================================================================
        Pensemos en un gobierno que está compuesto por tres tipos de jerarquías:
         diputados, ministros y presidente. Queremos desarrollar un sistema de mensajería interno,
        en el que podamos enviarle documentos a los miembros gubernamentales. Además,
        queremos que los documentos recibidos, solo puedan ser leídos si están autorizados.
        Un documento está compuesto por el contenido (String) y un tipo (Integer).
        Los posibles tipos de documento son valores numéricos: 1, 2 o 3.
        Cada número representa un nivel de acceso:
            1 = Reservado
            2 = Secreto
            3 = Muy secreto
        Los documentos de categoría “Reservado”, los leerán los diputados, los clasificados como “Secreto”,
        los ministros y por último, los categorizados como “Muy secreto” los leerá el presidente.
        También tengamos en cuenta que cada uno podrá leer los documentos que se encuentren
        clasificados en un orden menor al suyo. Por ejemplo, el presidente podrá leer todos los documentos,
         pero los diputados solo podrán leer los de categoría “Reservado”.
        Pensemos a los diputados, ministros y presidentes como usuarios del sistema. Queremos que al momento
        en el que cualquiera de los tres tipos de usuario intente leer un documento (tenga o no acceso),
        lo envíe a otro tipo de usuario y así sucesivamente hasta que a todos los usuarios les llegue el documento.
        Los tres tipos de usuario deberán tener un método para leer el documento y un atributo que indicara que tipo
        de acceso tiene (1, 2 o 3). Este método recibirá un documento y según el tipo de jerarca que sea,
        evaluará si lo puede leer, en caso de que pueda, lo hará y además lo enviará a otro jerarca.
        En el caso de que no tenga acceso para leerlo, también lo enviará a otro tipo de jerarca.
        Te proponemos representar la solución en un diagrama UML e implementarlo en JAVA.
        ================================================================================================== */

        Documento documento_1 = new Documento("Hola mundo!", 2, true);
        Documento documento_2= new Documento("Hola gentusa", 1, true);
        Presidente presidente = new Presidente();
        Ministro ministro = new Ministro();
        ministro.setSiguienteEmpleadoGob(presidente);
        Diputado diputado = new Diputado();
        diputado.setSiguienteEmpleadoGob(ministro);
        presidente.setSiguienteEmpleadoGob(diputado);

        diputado.procesarMensaje(documento_1);
        ministro.procesarMensaje(documento_2);


    }
}
