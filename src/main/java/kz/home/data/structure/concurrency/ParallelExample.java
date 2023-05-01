package kz.home.data.structure.concurrency;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;

/**
 * @author duman
 * @createdAt 26/04/2023 17:59
 * @project data-structure
 */
public class ParallelExample {
    public static void main(String[] args) {
        int[] numbers = ThreadLocalRandom.current().
                ints(100_000_000)
                .toArray();

        testingSort(numbers);
    }

    private static void testingSort(int[] numbers) {
        sort("Sequential sort time: ", numbers.clone(), Arrays::sort);
        sort("Parallel sort time: ", numbers.clone(), Arrays::parallelSort);
    }

    private static void sort(String description, int[] numbers, Consumer<int []> sort) {
        long time = System.currentTimeMillis();
        try {
            sort.accept(numbers);
        } finally {
            time = System.currentTimeMillis() - time;
            System.out.println(description + time);
        }
    }
}
