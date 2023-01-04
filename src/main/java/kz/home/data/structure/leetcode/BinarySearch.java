package kz.home.data.structure.leetcode;

/**
 * @author duman
 * @createdAt 04/01/2023 20:45
 * @project data-structure
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 6, 11, 23, 32, 41, 44, 51, 69, 74, 88, 91}, 69));
    }

    public static int binarySearch(int[] array, int element) {
        int low = 0;
        int high = array.length-1;
        while (low <= high) {
            var mid = (low + high)/2;
            var guess = array[mid];
            if (guess == element)
                return mid;
            else if (guess > element)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
