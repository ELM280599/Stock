package stock;

public class Monitor extends Producto {

    int Hz;
    String Resolucion;

    public Monitor(int pCodigo, String ptipo, String pMarca, String pNombre, int pStock, int preposicion, double pPrecio, int pHz, String pResolucion) {
        super(pCodigo, ptipo, pMarca, pNombre, pStock, preposicion, pPrecio);
        Hz = pHz;
        Resolucion = pResolucion;

    }

    @Override
    public String toString() {
        String sProducto = super.toString();
        String sMonitor = "--" + Hz + "Hz" + "--" + Resolucion + "pixeles";

        return sProducto + sMonitor;
    }
}
