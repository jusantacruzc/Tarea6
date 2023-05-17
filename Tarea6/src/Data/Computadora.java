package Data;

public class Computadora extends DispositivoEntrada {

    private final int idComputadora;
    private static int contadorComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Mouse mouse, String marca, String impuesto) {
        super(marca, impuesto);
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
        this.idComputadora = ++Computadora.contadorComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
    
    public int getIdComputadora(){
        return this.idComputadora;
    }

    @Override
    public String toString() {
        return super.toString() + "\nComputadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", mouse=" + mouse + '}';
    }
    
    
    
}
