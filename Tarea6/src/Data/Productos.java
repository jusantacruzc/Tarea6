package Data;

public class Productos {
    private final int idProducto;
    private static int contadorProductos;
    private String impuesto;

    
    public Productos(){
        this.idProducto = ++Productos.contadorProductos; 
    }

    public Productos(String impuesto) {
        this();
        this.impuesto = impuesto;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }
    
    public int getIdProducto(){
        return this.idProducto;
    }
    
    @Override
    public String toString() {
        return "\nProductos{" + "impuesto=" + impuesto + '}';
    }
    
    
}
