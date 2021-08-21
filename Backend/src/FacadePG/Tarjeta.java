package FacadePG;

public class Tarjeta {
    public Integer numerosFrente;
    public Integer codSeguridad;

    public Tarjeta(Integer numerosFrente, Integer codSeguridad) {
        this.numerosFrente = numerosFrente;
        this.codSeguridad = codSeguridad;
    }

    public Integer getNumerosFrente() {
        return numerosFrente;
    }

    public void setNumerosFrente(Integer numerosFrente) {
        this.numerosFrente = numerosFrente;
    }

    public Integer getCodSeguridad() {
        return codSeguridad;
    }

    public void setCodSeguridad(Integer codSeguridad) {
        this.codSeguridad = codSeguridad;
    }
}
