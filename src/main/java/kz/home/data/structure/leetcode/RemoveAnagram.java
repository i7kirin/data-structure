package kz.home.data.structure.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author duman
 * @createdAt 29/12/2022 11:02
 * @project data-structure
 */
public class RemoveAnagram {
    public static void main(String[] args) {
        System.out.println(removeAnagram(new String[]{"duman", "umand", "rakhat", "rakhata", "afif", "fifa"}));
    }

    public static List<String> removeAnagram(String[] arr) {
        List<String> result = new ArrayList<>();
        List<String> sortedList = new ArrayList<>();
        for(String s : arr) {
            String sorted = sortString(s);
            if (!sortedList.contains(sorted)){
                sortedList.add(sorted);
                result.add(s);
            }
        }

        Collections.sort(result);
        return result;
    }

    public static String sortString(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return Arrays.toString(a);
    }
}
