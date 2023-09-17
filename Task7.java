package class24;
//Chat version
//Create an arrayList of fruit then remove all the fruit
// which contains the letter a or ends with the letter e


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Pear");
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("Cherry");
        fruit.add("Banana");
        fruit.add("Pineapple");
        fruit.add("Grapefruit");

        // Use Java Streams to filter and collect fruits that don't contain 'a' or end with 'e'
        List<String> filteredFruit = fruit.stream()
                .filter(s -> !s.contains("a") && !s.endsWith("e"))
                .collect(Collectors.toList());

        // Clear the original ArrayList
        fruit.clear();

        // Add the filtered fruits back to the ArrayList
        fruit.addAll(filteredFruit);

        // Print the modified ArrayList
        System.out.println(fruit);
    }
}









