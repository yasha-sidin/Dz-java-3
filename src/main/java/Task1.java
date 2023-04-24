import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.*;


public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listRandom = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listRandom.add(random.nextInt(100));
        }
        listRandom.sort(Comparator.naturalOrder());
// Collections.sort(list, Comparator.reverseOrder());
        System.out.println(listRandom);
    }
}
