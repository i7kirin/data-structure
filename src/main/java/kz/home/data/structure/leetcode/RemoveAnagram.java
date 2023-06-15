package kz.home.data.structure.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author duman
 * @createdAt 29/12/2022 11:02
 * @project data-structure
 */
public class RemoveAnagram {
    public static void main(String[] args) {
        System.out.println(removeAnagramHashMap(new String[]{"damun", "duman", "umand", "rakhat", "rakhata", "afif", "fifa"}));
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

    public static List<String> removeAnagramHashMap(String[] arr) {
        HashMap<String, String> map = new HashMap<>();
        for(String s : arr) {
            String sorted = sortString(s);
            map.putIfAbsent(sorted, s);
        }
        return map.values().stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static String sortString(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return Arrays.toString(a);
    }
}
