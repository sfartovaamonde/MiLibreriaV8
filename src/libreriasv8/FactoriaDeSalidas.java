package libreriasv8;

/**
 * Fabrica encargada de devolver el producto
 * que elegimos según el tipo
 */
public class FactoriaDeSalidas {
    /**
     * Devuelve producto del tipo de la Interface
     * @param type 1: consola, 2:ventana
     * @param msg string a imprimir
     * @return producto segun el tipo
     */
    public static InterfaceMetodosComunes getProducto(int type, String msg) {
        switch (type) {
            // tipo consola
            case 1:
                return new Consola(msg);
            // tipo ventana
            case 2:
                return new Ventana(msg);
            // otro tipo
            default:
                return null;
        }
    }
}
