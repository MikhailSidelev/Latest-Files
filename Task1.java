package class24;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Jeep");
        cars.add("GMC");
        cars.add("Ford");
        cars.add("KIA");
        cars.add("Toyota");

        for (String car : cars) {
            System.out.print(car);
            System.out.print(" ");
        }


        System.out.println(cars);
        System.out.println(cars.toString());
    }
}
