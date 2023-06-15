package kz.home.data.structure;

/**
 * @author duman
 * @createdAt 08/05/2023 15:02
 * @project data-structure
 */
public class Inheritance1 {
    public static void main(String[] args) {
         Parent child = new Child();
        System.out.println(child.value + " " + child.getValue());
    }
}

class Parent {
    public String value = "Parent";

    public String getValue() {
        return value;
    }
}

class Child extends Parent {
    public String value = "Child";

    public String getValue() {
        return value;
    }
}