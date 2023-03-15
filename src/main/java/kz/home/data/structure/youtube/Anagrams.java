package kz.home.data.structure.youtube;

import java.util.TreeMap;

/**
 * @author duman
 * @createdAt 14/03/2023 19:46
 * @project data-structure
 */
public class Anagrams {
    public static void main(String[] args) {
//        System.out.println(isAnagram("dogg", "ggod"));
        String s = "comdsfcfmekrmfekormfoekrmfokermfokermfokermfokermfokermfokmerofmcomdsfcfmekrmfekormfoekrmfokermfokermfokermfokermfokermfokmerofmcomdsfcfmekrmfekormfoekrmfokermfokermfokermfokermfokermfokmerofmcomdsfcfmekrmfekormfoekrmfokermfokermfokermfokermfokermfokmerofmcomdsfcfmekrmfekormfoekrmfokermfokermfokermfokermfokermfokmerofmcomdsfcfmekrmfekormfoekrmfokermfokermfokermfokermfokermfokmerofmcomdsfcfmekrmfekormfoekrmfokermfokermfokermfokermfokermfokmerofmcomdsfcfmekrmfekormfoekrmfokermfokermfokermfokermfokermfokmerofmcomdsfcfmekrmfekormfoekrmfokermfokermfokermfokermfokermfokmerofmcomdsfcfmekrmfekormfoekrmfokermfokermfokermfokermfokermfokmerofmcomdsfcfmekrmfekormfoekrmfokermfokermfokermfokermfokermfokmerofmcomdsfcfmekrmfekormfoekrmfokermfokermfokermfokermfokermfokmerofm";
        testCharAt(s);
        long start = System.currentTimeMillis();
        testCharAt(s);
        long end = System.currentTimeMillis();
        System.out.println(end + " " + start);

    }

    private static boolean isAnagram(String a, String b) {
        return getArray(a) == (getArray(b));
    }

    private static char[] getArray(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

        }
        return chars;
    }

    private static void testCharAt(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
        }
    }

    private static void testCharArray(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
        }
    }
}
