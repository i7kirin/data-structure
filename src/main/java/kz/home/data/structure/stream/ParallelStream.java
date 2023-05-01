package kz.home.data.structure.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author duman
 * @createdAt 04/04/2023 15:09
 * @project data-structure
 */
public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100_000_000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        Integer integer = list.parallelStream()
                .reduce((acc, elem) -> acc + elem % 1000)
                .get();
        System.out.println("Spent time to operation = " + (System.currentTimeMillis() - start));
        System.out.println(integer);
    }
}
