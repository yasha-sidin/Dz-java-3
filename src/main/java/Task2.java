import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.lang.String;

public class Task2 {
    public static void main(String[] args) {
        String[] planetsOfSolarSystem = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            randomSolarSystem.add(planetsOfSolarSystem[random.nextInt(planetsOfSolarSystem.length)]);
        }

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
}
