package stock;

public class Producto {

    int codigo;
    String marca;
    String nombre;
    int Stock;
    double Precio;
    String tipo;
    int reposicion;

    public Producto(int pCodigo, String ptipo, String pMarca, String pNombre, int pStock, int preposicion, double pPrecio) {
        codigo = pCodigo;
        marca = pMarca;
        nombre = pNombre;
        Stock = pStock;
        Precio = pPrecio;
        tipo = ptipo;
        reposicion = preposicion;
    }

    @Override
    public String toString() {
        return codigo + "--" + tipo + "--" + marca + "--" + nombre + "--" + Stock + "en stock" + "--" + "$" + Precio;
    }
}
