
package sklep;

/**
 *
 * @author kamil
 */
public class Produkt 
{
    private String nazwa;
    private float waga;
    private double cena;

    public Produkt(String nazwa, float waga, double cena) {
        this.nazwa = nazwa;
        this.waga = waga;
        this.cena = cena;
    }

    public Produkt() {
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public float getWaga() {
        return waga;
    }

    public void setWaga(float waga) {
        this.waga = waga;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
          
           
    
}
