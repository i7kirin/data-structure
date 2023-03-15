package kz.home.data.structure.youtube;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author duman
 * @createdAt 13/03/2023 23:14
 * @project data-structure
 */
public class ArrayTask_1 {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(Set.of("cat", "car", "foo"));
        System.out.println(dictionary.isWordExist("car"));
        System.out.println(dictionary.isWordExist("card"));
        System.out.println(dictionary.isWordExist("ca*"));
        System.out.println(dictionary.isWordExist("f*o"));
        System.out.println(dictionary.isWordExist("*o*"));
    }

}

class Dictionary {

    private final Set<String> set;

    public Dictionary(Set<String> words) {
        this.set = words;
    }

    public boolean isWordExist(String word) {
        for (String w : set) {
            if (w.contains(word.replace("*", "")))
             return true;
        }
        return false;
    }
}
