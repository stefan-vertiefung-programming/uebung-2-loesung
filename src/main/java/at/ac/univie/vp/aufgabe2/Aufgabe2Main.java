package at.ac.univie.vp.aufgabe2;

public class Aufgabe2Main {

    public static void main(String[] args) {

        CustomList<String> list = new CustomList<>(100);

        System.out.println(list.add("a"));
        System.out.println(list.add("b"));
        System.out.println(list.add("a"));

        System.out.println();
        System.out.println(list.contains("a"));
        System.out.println(list.contains("x"));

        System.out.println();
        System.out.println(list.indexOf("a"));
        System.out.println(list.indexOf("b"));
        System.out.println(list.indexOf("x"));

        System.out.println();
        System.out.println(list);

        System.out.println();
        System.out.println(list.remove("a"));
        System.out.println(list);

        System.out.println();
        System.out.println(list.remove("a"));
        System.out.println(list);

        System.out.println();
        System.out.println(list.remove("x"));
        System.out.println(list);

        System.out.println();
        System.out.println(list.remove("b"));
        System.out.println(list);
    }
}