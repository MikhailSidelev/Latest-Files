package class24;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Manhattan");
        drinks.add("WhiteRussian");
        drinks.add("Mimosa");
        drinks.add("Martini");
        drinks.add("Mojito");
        drinks.add("Milk");

        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);

            if (drink.contains("a") || drink.contains("e")) {
                drinks.set(i, "Water");
            }
        }

        System.out.println(drinks);
    }
}
