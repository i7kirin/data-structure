package kz.home.data.structure.leetcode;

import java.util.Arrays;

/**
 * @author duman
 * @createdAt 21/02/2023 11:03
 * @project data-structure
 */
public class SingleNonDuplicate {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.singleNonDuplicate(new int[]{1,2,2,3,3,4,4,8,8}));
    }
}
class Solution {
//    public int singleNonDuplicate(int[] nums) {
//        int left = 0, right = nums.length-1;
//        while(left < right){
//            int mid = (left + right)/2;
//            if((mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]))
//                left = mid + 1;
//            else
//                right = mid;
//        }
//        return nums[left];
//    }

    public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] != nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 2;
            }
        }

        return nums[start];
    }
    public int mySingleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        if(nums.length == 1) return nums[0];
        while(low <= high) {
            int mid = (low + high)/2;
            if(mid == nums.length - 1 && nums[mid-1] != nums[mid])
                return nums[mid];
            if(mid == 0 && nums[mid+1] != nums[mid])
                return nums[mid];
            if (nums[mid-1] != nums[mid] && nums[mid+1] != nums[mid])
                return nums[mid];
            if(mid % 2 == 0 && nums[mid] != nums[mid - 1] ||
                    (mid-1) % 2 == 0 && nums[mid] == nums[mid - 1])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return 0;
    }
}