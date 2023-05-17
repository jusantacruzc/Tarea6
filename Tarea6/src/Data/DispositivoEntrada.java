
package Data;

public abstract class DispositivoEntrada extends Tecnologia {
    private String tipoEntrada;

    public DispositivoEntrada(String marca, String impuesto) {
        super(marca, impuesto);
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    @Override
    public String toString() {
        return super.toString() +"\nDispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + '}';
    }
       
}
