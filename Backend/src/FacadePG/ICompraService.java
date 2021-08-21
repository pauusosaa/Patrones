package FacadePG;

public interface ICompraService {
    public void procesarCompra(String productoId, Integer cantidad, Tarjeta tarjeta, Direccion direccion);
}
