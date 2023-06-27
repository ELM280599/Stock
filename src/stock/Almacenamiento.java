package stock;

public class Almacenamiento extends Producto {

    int Capacidad;
    String Tipo;

    public Almacenamiento(int pCodigo, String ptipo, String pMarca, String pNombre, int pStock, int preposicion, double pPrecio, int pCapacidad, String pTipo) {
        super(pCodigo, ptipo, pMarca, pNombre, pStock, preposicion, pPrecio);
        Capacidad = pCapacidad;
        Tipo = pTipo;

    }

    @Override
    public String toString() {
        String sProducto = super.toString();
        String sAlmacenamiento = "-" + Capacidad + "Gigas" + "-" + Tipo;

        return sProducto + sAlmacenamiento;
    }
}
