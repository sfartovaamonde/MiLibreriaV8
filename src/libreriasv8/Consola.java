package libreriasv8;

public class Consola implements SalidaDelMensaje{
    private String msg;

    /**
     * Constructor
     * @param msg mensaje que queremos imprimir
     */
    public Consola(String msg){
        this.msg=msg;
    };

    /**
     * Visualizamos mensaje por consola
     */
    @Override
    public void visualiza(){
        System.out.println("Sale por la consola " + msg);
    }
}
