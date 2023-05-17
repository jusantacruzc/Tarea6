
package Data;

public class Mouse extends DispositivoEntrada {
    private int pesoGr;
    private final int idMouse;
    private static int contadorMouse;

    public Mouse(int pesoGr, String marca, String impuesto) {
        super(marca, impuesto);
        this.pesoGr = pesoGr;
        this.idMouse = ++Mouse.contadorMouse;
    }

    public int getPesoGr() {
        return pesoGr;
    }

    public void setPesoGr(int pesoGr) {
        this.pesoGr = pesoGr;
    }
    
    public int getIdMouse(){
        return this.idMouse;
    }

    @Override
    public String toString() {
        return super.toString() +"\nMouse{" + "pesoGr=" + pesoGr + ", idMouse=" + idMouse + '}';
    }
    
    
    
}
