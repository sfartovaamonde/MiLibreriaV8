package libreriasv8;

/**
 * Contiene metodos utiles para usar en los proyectos
 */
public class MisMetodos {
    /**
     * método que monta un saludo
     * @param mensaje saludo que quiero mostrar
     * @return cadena con el mensaje concatenado con otra String
     */
    public static String saludo(String mensaje){
        return "Saludo MODIFICACION: " + mensaje;
    }
    public static String adios(String mensaje){
        return "Adios: " + mensaje;
    }
}
