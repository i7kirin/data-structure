package kz.home.data.structure.leetcode;

import java.util.List;

/**
 * @author duman
 * @created 01/12/2022 11:19
 * @project data-structure
 */

/*
    1704. Determine if String Halves Are Alike
    You are given a string s of even length. Split this string into two
     halves of equal lengths, and let a be the first half and b be the second half.

    Two strings are alike if they have the same number of vowels
    ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice
    that s contains uppercase and lowercase letters.

    Return true if a and b are alike. Otherwise, return false.
 */
public class StringHalvesAlike {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
        System.out.println(halvesAreAlike("textbook"));
    }

    public static boolean halvesAreAlike(String s) {
        int half = s.length()/2;
        final String vowels = "aeiouAEIOU";
        final String a = s.substring(0,half);
        final String b = s.substring(half);
        int aVowelCount = 0;
        int bVowelCount = 0;
        for(int i = 0; i < half; i++) {
            if(vowels.indexOf(a.charAt(i)) != -1) aVowelCount++;
            if(vowels.indexOf(b.charAt(i)) != -1) bVowelCount++;
        }
        return aVowelCount == bVowelCount;
    }
}
