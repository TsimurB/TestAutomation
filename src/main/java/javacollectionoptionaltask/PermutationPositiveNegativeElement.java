package javacollectionoptionaltask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PermutationPositiveNegativeElement {

    private static final int BOUND_1 = 15;
    private static final int BOUND_2 = 16;

    public static List<Integer> createNewList() {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < BOUND_1; i++) {
            int number = -BOUND_1 + random.nextInt(BOUND_2 + BOUND_1);
            integers.add(number);
        }
        return integers;
    }

    public static void main(String[] args) {
        List<Integer> list = createNewList();
        System.out.println(list);
        List<Integer> result = list.stream().sorted((Integer o1, Integer o2) -> o2).collect(Collectors.toList());
        System.out.println(result);
    }
}
