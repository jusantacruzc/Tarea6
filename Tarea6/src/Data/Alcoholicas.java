package Data;

import java.util.Date;

public class Alcoholicas extends Bebidas {

    private float porcentajeAlcohol;
    private final int idAlcohol;
    private static int contadorAlcohol;

    public Alcoholicas(float porcentajeAlcohol, float medidaEnMl, Date fechaCaducidad, String impuesto) {
        super(medidaEnMl, fechaCaducidad, impuesto);
        this.porcentajeAlcohol = porcentajeAlcohol;
        this.idAlcohol = ++Alcoholicas.contadorAlcohol;
    }

    public float getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }

    public void setPorcentajeAlcohol(float porcentajeAlcohol) {
        this.porcentajeAlcohol = porcentajeAlcohol;
    }
    
    public int getIdAlcohol(){
        return this.idAlcohol;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAlcoholicas{" + "porcentajeAlcohol=" + porcentajeAlcohol + ", idAlcohol=" + idAlcohol + '}';
    }
    
    
    
}
