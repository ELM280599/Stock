package stock;

public class Notebook extends Producto {

    int pulgadas;
    String Ram;
    String tipo;

    public Notebook(int pCodigo, String ptipo, String pMarca, String pNombre, int pStock, int preposicion, double pPrecio, int pPulgadas, String pRam) {
        super(pCodigo, ptipo, pMarca, pNombre, pStock, preposicion, pPrecio);
        pulgadas = pPulgadas;
        Ram = pRam;
        tipo = ptipo;
    }

    @Override
    public String toString() {
        String sProducto = super.toString();
        String sNotebook = "--" + pulgadas + " pulgadas" + "--" + Ram + " memoria RAM";

        return sProducto + sNotebook;
    }
}
