package class24;
//Right version.
//Create an arrayList of fruit then remove all the fruit
// which contains the letter a or ends with the letter e


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Pear");
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("Cherry");
        fruit.add("Banana");
        fruit.add("Pineapple");
        fruit.add("Grapefruit");
fruit.removeIf(d->d.contains("a")||d.endsWith("e"));
        System.out.println(fruit);
    }
}









