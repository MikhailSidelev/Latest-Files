package class24;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
             //names is ArrayList data type
        ArrayList<String > names=new ArrayList<>();
        names.add("Deepali");
        names.add("Ahmed");
        names.add("Mike");
        names.add("Mikhail");
        names.add("Lisa");
        names.add("Shawn");
        //names.remove(0);same as names.remove("Deepali");
        names.remove("Deepali");
        System.out.println(names);
        names.add(0,"Ehab");
        System.out.println(names);
        names.set(1,"Jamel");
        System.out.println(names);

    }
}
