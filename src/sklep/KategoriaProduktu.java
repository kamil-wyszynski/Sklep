
package sklep;

import java.util.ArrayList;
import java.util.List;

public class KategoriaProduktu extends Produkt
{
    private String kategoria;
    List<Produkt> produkty = new ArrayList<>();
    public void addProdukt (Produkt produkt)
    {
        produkty.add(produkt);
    }
       public void removeProdukt (Produkt produkt)
    {
        produkty.remove(produkt);
    }
    public List<Produkt> showProdukt()
    {
     return produkty;
    }
    
    
    
}
