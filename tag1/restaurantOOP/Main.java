package tag1.restaurantOOP;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> speisekarte = new HashMap<>();
        // getraenke
        speisekarte.put("Cola", 4.0);
        speisekarte.put("Apfelsaft", 4.0);
        speisekarte.put("Bier", 4.0);
        // essen
        speisekarte.put("pizza", 19.99);
        speisekarte.put("Doener", 9.99);
        speisekarte.put("SchniPoSa", 18.99);

        Besucher mike = new Besucher(2, speisekarte);

        mike.setBestellung("SchniPoSa", "Cola");
        System.out.println(mike.getRechnung());
    }
}
