package class24;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        ArrayList<String > names=new ArrayList<>();
        names.add("Deepali");
        names.add("Ahmed");
        names.add("Mike");
        names.add("Mikhail");
        names.add("Lisa");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Mikhail"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
