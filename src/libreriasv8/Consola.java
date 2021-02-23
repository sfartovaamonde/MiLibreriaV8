package libreriasv8;

public class Consola {
    private String msg;
    public Consola( String msg){
        this.msg=msg;
    };
    public void visualiza(String msg){
        System.out.println("Sale por la consola" + msg);
    }
}
