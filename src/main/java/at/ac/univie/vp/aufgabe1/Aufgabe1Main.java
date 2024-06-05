package at.ac.univie.vp.aufgabe1;

public class Aufgabe1Main {

    public static void main(String[] args) {

        CustomList<String> list = new CustomList<>(100);
        System.out.println(list.add("a"));
        System.out.println(list.add("b"));

        System.out.println();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.clear();
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}