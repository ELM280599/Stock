package stock;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Metodos mt = new Metodos();
        System.out.println("Listado de productos: " + mt.listado);

        // METODO 1
        // busca un producto que existe en stock, debe devolver el producto
        Producto buscar = mt.buscarProductoPorCodigo(2);
        if (buscar == null) {
            System.out.println("No se encontro el producto  2");
        } else {
            System.out.println("Producto buscado 2: " + buscar);
        }
        // busca un producto que no existe en stock, debe devolver null
        Producto buscar2 = mt.buscarProductoPorCodigo(25);
        if (buscar2 == null) {
            System.out.println("No se encontro el producto");
        } else {
            System.out.println("Producto buscado 300: " + buscar2);
        }
        System.out.println("--------------------------------------------------------------------------");

        // METODO 2 muestro el listado completo de todos los productos
        ArrayList<Producto> list = mt.getListadoCompleto();
        System.out.println("Listado completo: " + list);
        System.out.println("--------------------------------------------------------------------------");
        //METODO 3 devuelvo un listado de productos segun el tipo
        ArrayList<Producto> tipo = mt.DevolverProuctoTipo("Notebook");
        System.out.println("Buscando productos...");
        System.out.println("Listado: " + tipo);
        System.out.println("--------------------------------------------------------------------------");
        //METODO 4 Busco productos por nombre o marca
        ArrayList<Producto> aux1 = mt.buscarProductosPorNombre("DtSE9h", "LEnOVO");
        System.out.println("Los productos por nombre son: " + aux1);
        System.out.println("--------------------------------------------------------------------------");

        //METODO 5 Muestro productos menores y mayores al precio establecido
        ArrayList<Producto> aux = mt.buscarProductosPorPrecio(10000, true);
        System.out.println("Los productos por precio son: " + aux);
        System.out.println("--------------------------------------------------------------------------");
        //METODO 6 Agrego un producto al listado
        Notebook not3 = new Notebook(11, "Notebook", "Dell", "XZ265", 15, 10, 21000.0, 17, "Intel i5");
        boolean añadir = mt.agregarProducto(not3);
        System.out.println("Producto agregado! " + añadir);
        System.out.println("--------------------------------------------------------------------------");
        //METODO 7 agrego stock al listado
        boolean agregar = mt.AgregarStock(2, 6);
        System.out.println("Agregando Stock..." + agregar);
        System.out.println("Stock actualziado: " + mt.getListadoCompleto());
        // METODO 7 agrego stock con un codigo erroneo
        boolean agregar2 = mt.AgregarStock(120, 5);
        System.out.println("El codigo ingresado no pertenece a ningun producto..." + agregar2);
        System.out.println("--------------------------------------------------------------------------");

        //METODO 8 quito stock al listado
        boolean quitar = mt.QuitarStock(7, 10);
        System.out.println("Quitando Stock...." + quitar);
        System.out.println("Stock actualizado: " + mt.getListadoCompleto());
        // METODO 8 quito mas stock del que hay disponible
        boolean quitar2 = mt.QuitarStock(7, 80);
        System.out.println("Quitando Stock...." + quitar);
        // METODO 8 quito stock con un codigo erroneo
        boolean quitar3 = mt.QuitarStock(200, 45);
        System.out.println("Stock actualizado: " + mt.getListadoCompleto());
        System.out.println("El codigo ingresado no pertenece a ningun producto..." + quitar3);
        System.out.println("--------------------------------------------------------------------------");
 
        //METODO 9 Elimino un producto del listado
        boolean eliminar = mt.RemoverProducto(1);
        System.out.println("Eliminando producto...." + eliminar);
        System.out.println("Producto eliminado correctamente!");
        System.out.println("Listado actualizado: " + mt.getListadoCompleto());
        //METODO 9 Elimino un producto del listado con un codigo erroneo
        boolean eliminar2 = mt.RemoverProducto(15);
        System.out.println("Eliminando producto....");
        System.out.println("El codigo ingresado no pertenece a ningun producto..." + eliminar2);
        System.out.println("--------------------------------------------------------------------------");
        //METODO 10 muestro la alerta del minimo de stock
        mt.Alerta();
        //METODO 11 devuelvo el total de dinero en stock
        double total = mt.DevolverTotalStock();
        System.out.println("El total del stock es:$ " + total);
        System.out.println("El total del stock es:$ " + mt.DevolverTotalStock());
        System.out.println("--------------------------------------------------------------------------");
        //METODO 12 devuelvo la cantidad total de unidades en stock
        //METODO 13 devuelvo el promedio del precio de Notebooks
        double prom = mt.PromedioNotebook();
        System.out.println("El promedio de las Notebook es:$ " + prom);

    }
}
