package kz.home.data.structure.leetcode;

import java.util.*;

/**
 * @author duman
 * @createdAt 16/05/2023 11:08
 * @project data-structure
 */
class LeetCode347 {

    public static void main(String[] args) {
        int[] ints = topKFrequent(new int[]{1, 1, 1, 3, 3, 3, 4, 4, 5}, 3);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsWithFrequency = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsWithFrequency.containsKey(nums[i])) {
                numsWithFrequency.put(nums[i], numsWithFrequency.get(nums[i]) + 1);
                if (numsWithFrequency.get(nums[i]) >= k)
                    list.add(nums[i]);
            } else
                numsWithFrequency.put(nums[i], 1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}