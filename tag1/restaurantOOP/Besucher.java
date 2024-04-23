package tag1.restaurantOOP;

import java.util.HashMap;
import java.util.Map;

public class Besucher {
    Map<String, Double> bestellung;
    Double rechnungsbetrag;
    int tischnummer;
    Map<String, Double> speisekarte;
    Besucher(int tischnummer, Map<String, Double> speisekarte) {
        this.tischnummer = tischnummer;
        this.rechnungsbetrag = 0.0;
        this.bestellung = new HashMap<>();
        this.speisekarte = speisekarte;
    }

    void setBestellung(String... essen) {
        for (String s : essen) {
            this.bestellung.put(s, this.speisekarte.get(s));
        }
   }

   Double getRechnung() {
        for (double price : this.bestellung.values()) {
            this.rechnungsbetrag += price;
        }
        return this.rechnungsbetrag;
   }
}
