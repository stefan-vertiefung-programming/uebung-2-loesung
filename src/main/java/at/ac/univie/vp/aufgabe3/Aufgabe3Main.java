package at.ac.univie.vp.aufgabe3;

import java.util.ArrayList;

public class Aufgabe3Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.add(12));
        System.out.println(list.add(13));

        System.out.println();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.clear();
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println(list.add(12));
        System.out.println(list.add(13));
        System.out.println(list.add(12));

        System.out.println();
        System.out.println(list.contains(12));
        System.out.println(list.contains(15));

        System.out.println();
        System.out.println(list.indexOf(12));
        System.out.println(list.indexOf(13));
        System.out.println(list.indexOf(15));

        System.out.println();
        System.out.println(list);

        System.out.println();
        System.out.println(list.remove(12));
        System.out.println(list);

        System.out.println();
        System.out.println(list.remove(12));
        System.out.println(list);

        System.out.println();
        System.out.println(list.remove(15));
        System.out.println(list);

        System.out.println();
        System.out.println(list.remove(13));
        System.out.println(list);
    }
}