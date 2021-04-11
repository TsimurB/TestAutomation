package javacollectionoptionaltask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PermutationPositiveNegativeElement {
    public static List<Integer> createNewList() {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random(System.currentTimeMillis());
        for(int i = 0; i < 15; i++) {
            int number = -15 + random.nextInt(16 + 15);
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
