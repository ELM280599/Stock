package stock;

import java.util.ArrayList;

public class Metodos {

    ArrayList<Producto> listado;
    //ALT + Shift + F acomodar codigo

    public Metodos() {
        listado = new ArrayList<Producto>();

        Notebook not1 = new Notebook(1, "Notebook", "Dell", "Inspiron", 20, 10, 25000.0, 17, "Intel i3");
        Notebook not2 = new Notebook(2, "Notebook", "Lenovo", "Ideal Pad", 12, 10, 28000.0, 19, "AMD Ryzen 1200");
        Monitor mon1 = new Monitor(3, "Monitor", "Zowie", "Xl2740", 14, 10, 120000.0, 240, "1920x1080");
        Monitor mon2 = new Monitor(4, "Monitor", "HP", "N246V", 11, 10, 26000.0, 80, "1920x1080");
        Almacenamiento alm1 = new Almacenamiento(5, "Almacenamiento", "Kingston", "Dtse9h", 13, 10, 9400.0, 32, "USB");
        Almacenamiento alm2 = new Almacenamiento(6, "Almacenamiento", "Seagate", "Barracuda", 26, 10, 3360.0, 1000, "Disco rigido");
        Almacenamiento alm3 = new Almacenamiento(7, "Almacenamiento", "Kingston", "Dtse9h", 18, 10, 5200.0, 16, "USB");
        listado.add(not1);
        listado.add(not2);
        listado.add(mon1);
        listado.add(mon2);
        listado.add(alm1);
        listado.add(alm2);
        listado.add(alm3);
    }

    /**
     * METODO 1 busco un producto por su codigo
     *
     * @param pCodigo parametro por el cual se ingresa el codigo y se busca el
     * producto
     * @return devuelve el producto que cumpla con el criterio
     */
    public Producto buscarProductoPorCodigo(int pCodigo) {
        Producto aux = null;
        for (Producto p : listado) {
            if (p.codigo == pCodigo) {
                aux = p;
                break;
            }
        }

        return aux;
    }

    /**
     * METODO 2
     *
     * @return Devuelve el listado completo con todos los productos y sus
     * atributos
     */
    public ArrayList<Producto> getListadoCompleto() {
        return listado;
    }

    /**
     * METODO 3 Recibe un parametro para devolver un listado de productos segun
     * el tipo
     *
     * @param ptipo nombre por el que se buscan los productos
     * @return se devuelve el listado con los prodcutos que cumplen el criterio
     */
    public ArrayList<Producto> DevolverProuctoTipo(String ptipo) {
        ArrayList<Producto> aux1;
        aux1 = new ArrayList<Producto>();
        for (Producto p : listado) {
            // if (ptipo.toUpperCase().equals("NOTEBOOK") && p instanceof Notebook) {

            //   aux1.add(p);
            //}
            if (p.tipo.toUpperCase().contains(ptipo.toUpperCase())) {

                aux1.add(p);

            }

        }
        return aux1;

    }

    /**
     * Metodo 4 Recibe dos parametros Buscar producto por Nombre o marca
     *
     * @param pnombre nombre por el que se busca el producto
     * @param pmarca marca por la que se busca el producto
     * @return se devuelve el listado con los prodcutos que cumplen el criterio
     */
    public ArrayList<Producto> buscarProductosPorNombre(String pnombre, String pmarca) {
        ArrayList<Producto> aux1;
        aux1 = new ArrayList<Producto>();

        for (Producto n : listado) {

            if (n.nombre.toUpperCase().contains(pnombre.toUpperCase()) || n.marca.toUpperCase().contains(pmarca.toUpperCase())) {

                aux1.add(n);

            }

        }
        return aux1;

    }

    /**
     * METODO 5 busco productos en stock por debajo de un valor o por encima
     *
     * @param Precio se utiliza para indicar el precio por el cual se van a
     * buscar los productos
     * @param mayora indica si los productos son mayores al precio indicado o
     * menores (true = mayor, false = menor)
     * @return devuelve los productos que cumplan con la consigna
     */
    public ArrayList<Producto> buscarProductosPorPrecio(double Precio, boolean mayora) {

        ArrayList<Producto> aux;
        aux = new ArrayList<Producto>();

        for (Producto p : listado) {

            if (mayora == true) {

                if (p.Precio >= Precio) {
                    aux.add(p);

                }

            } else {
                if (p.Precio <= Precio) {
                    aux.add(p);

                }

            }
        }

        return aux;

    }

    /**
     * METODO 6 agrego un producto a la lista
     *
     * @param p se utiliza para ingresar el producto
     * @return
     */
    public boolean agregarProducto(Producto p) {

        Producto aux = buscarProductoPorCodigo(p.codigo); // RETUTILIZO EL METODO YA PROGRAMADO
        boolean guardado = false;

        if (aux == null) {
            listado.add(p);
            guardado = true;
        }

        return guardado;

    }

    /**
     * METODO 7 agreggo stock al producto seleccionado
     *
     * @param pcodigo se utiliza para buscar el producto del cual se desea
     * agregar stock
     * @param pcantidad se indica la cantidad de stock que se desea agregar
     * @return
     */
    public boolean AgregarStock(int pcodigo, int pcantidad) {
        Producto aux = buscarProductoPorCodigo(pcodigo);
        if (aux != null) {
            aux.Stock = aux.Stock + pcantidad;
            return true;

        } else {

            return false;
        }

    }

    /**
     * METODO 8 quito cantidad al stock de un producto deseado
     *
     * @param pcodigo se utiliza para buscar el producto del cual se desea
     * quitar stock
     * @param pcantidad se indica la cantidad de stock que se desea quitar
     * @return devuelve si se pudo quitar stock o no
     */
    public boolean QuitarStock(int pcodigo, int pcantidad) {
        Producto aux = buscarProductoPorCodigo(pcodigo);
        if (aux != null) {
            if (aux.Stock >= pcantidad) {
                aux.Stock = aux.Stock - pcantidad;
                return true;
            }

        }
        return false;

    }

    /**
     * METODO 9 elimino un producto de la lista de stock
     *
     * @param pcodigo este parametro se utiliza para buscar el producto que se
     * desea eliminar
     * @return devuelve si el producto pudo ser eliminado
     */
    public boolean RemoverProducto(int pcodigo) {
        Producto aux = buscarProductoPorCodigo(pcodigo);

        if (aux != null && aux.Stock == 0) {

            listado.remove(aux);
            return true;

        }
        return false;

    }

    /**
     * METODO 10 genero una alerta por debajo del minimo de stock comparo el
     * stock actual del producto con el minimo, si esta por debajo muestra una
     * alerta
     *
     */
    public void Alerta() {

        for (Producto p : listado) {
            if (p.Stock < p.reposicion) {
                System.out.println("Stock por debajo del minimo. REPONER!" + p);

            }

        }

    }

    //METODO 11
    public double DevolverTotalStock() {
        double acu = 0;
        for (Producto p : listado) {
            acu = acu + (p.Precio * p.Stock);

        }
        return acu;
    }

    //METODO 12
    public int DevolverTotalUnidades() {
        int acu = 0;
        for (Producto p : listado) {
            acu = acu + p.Stock;

        }
        return acu;

    }

    //METODO 13
    public double PromedioNotebook() {
        double totalprecio = 0;
        int cantidadnotebook = 0;
        double prom = 0;
        for (Producto p : listado) {
            if (p instanceof Notebook) {

                totalprecio = totalprecio + (p.Precio * p.Stock);
                cantidadnotebook = cantidadnotebook + p.Stock;

            }

        }
        prom = totalprecio / cantidadnotebook;
        return prom;

    }

}
