package kz.home.data.structure;

/**
 * @author duman
 * @createdAt 08/05/2023 15:11
 * @project data-structure
 */
public class Inheritance2 {
}

class Outer {
    class Inner {

    }
}

class SubClass extends Outer.Inner {
    SubClass(Outer outer) {
        outer.super();
    }
}
