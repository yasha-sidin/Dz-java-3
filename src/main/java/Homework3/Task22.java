package Homework3;

import java.util.*;
import java.lang.String;
public class Task22 {
    public static void main(String[] args) {
        String[] planetsOfSolarSystem = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            randomSolarSystem.add(planetsOfSolarSystem[random.nextInt(planetsOfSolarSystem.length)]);
        }
        System.out.println();
        ex1(randomSolarSystem, planetsOfSolarSystem);
        System.out.println();
        System.out.println(ex2(randomSolarSystem));

    }

    private static void ex1(List<String> randomSolarSystem, String[] planetsOfSolarSystem) {
        randomSolarSystem.sort(Comparator.naturalOrder());
        System.out.println(randomSolarSystem);
        int count = 0;
        for (int i = 0; i < planetsOfSolarSystem.length; i++) {
            count = 0;
            for (int j = 0; j < randomSolarSystem.toArray().length; j++) {
                if (randomSolarSystem.get(j).equals(planetsOfSolarSystem[i])) {
                    count++;
                }
            }
            System.out.printf("%s: %d\n", planetsOfSolarSystem[i], count);
        }
    }

    private static List<String> ex2(List<String> randomSolarSystem) {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < randomSolarSystem.size(); i++) {
            if (!temp.contains(randomSolarSystem.get(i))) {
                temp.add(randomSolarSystem.get(i));
            } else {
                randomSolarSystem.remove(i);
                i--;
            }
        }
        return randomSolarSystem;
    }
}
