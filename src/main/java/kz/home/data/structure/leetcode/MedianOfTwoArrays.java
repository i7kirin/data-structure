package kz.home.data.structure.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author duman
 * @created 26/11/2022 12:42
 * @project data-structure
 */
public class MedianOfTwoArrays {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,54,6,2},new int[]{6,5,1,77,9}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merged = new ArrayList<>(nums1.length + nums2.length);

        for(int i =0; i < nums1.length; i++) {
            merged.add(nums1[i]);
        }
        for(int i =0; i < nums2.length; i++) {
            merged.add(nums2[i]);
        }
        Collections.sort(merged);
        int length = merged.size();
        if(length == 0) return 0.0;
        return  length % 2 == 0
                ? (((double)merged.get(length/2 - 1)) + ((double)merged.get(length/2))) / 2
                : (double) merged.get(length/2);
    }
}
