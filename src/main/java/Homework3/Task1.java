package Homework3;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>(List.of("Яблоко", "11", "13", "Апельсин", "Дыня", "17"));
        System.out.println(elements);
        for(int i = 0; i < elements.size(); i++) {
            try {
                Integer.parseInt(elements.get(i));
                elements.remove(elements.get(i));
                i--;
            } catch (NumberFormatException e) {

            }
        }
        System.out.println(elements);
    }
}
