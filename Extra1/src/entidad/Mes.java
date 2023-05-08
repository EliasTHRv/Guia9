package entidad;

/**
 *
 * @author elias
 */
public class Mes {
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril","Mayo", "Junio", "Julio", "Agosto", "Septiembre","Octubre", "Noviembre","Diciembre" };
    private String mesSecreto = meses[(int)(Math.random()*11)];

    public Mes() {
    }

    
    
    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    
    
    
    
}
