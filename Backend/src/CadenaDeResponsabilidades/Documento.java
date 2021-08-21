package CadenaDeResponsabilidades;

import java.util.HashMap;

public class Documento {

    private String contenido;
    private Integer tipo;
    private boolean estaAutorizado;

    public HashMap<String, Boolean> lecturas = new HashMap<String, Boolean>();

    public Documento(String contenido, Integer tipo, boolean estaAutorizado) {
        this.contenido = contenido;
        this.tipo = tipo;
        this.estaAutorizado = estaAutorizado;
    }

    public String getContenido() {
        return contenido;
    }

    public HashMap<String, Boolean> getLecturas() {
        return lecturas;
    }

    public void setLecturas(HashMap<String, Boolean> lecturas) {
        this.lecturas = lecturas;
    }

    public void addLectura(String tipoLector, Boolean leido){
        this.getLecturas().put(tipoLector,leido);

    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public boolean isEstaAutorizado() {
        return estaAutorizado;
    }

    public void setEstaAutorizado(boolean estaAutorizado) {
        this.estaAutorizado = estaAutorizado;
    }
}
