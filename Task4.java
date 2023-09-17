package class24;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.add("milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV");
        System.out.println(words);
        /*for (int i = 0; i <words.size() ; i++) {
            if (words.get(i).endsWith("e")){
                words.set(i,"");

            }
        }*/
        /*words.removeIf((String x)->{
            if(x.endsWith("e")){

            }else {
                return true;
            }else {
                return false;
                    }
                });*/
        words.removeIf(x->x.endsWith("e"));

        System.out.println(words);
    }
    }







