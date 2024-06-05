package at.ac.univie.vp.aufgabe4;

import java.util.ArrayList;

public class Aufgabe4Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        initialisiere(list, 10);

        System.out.println();
        System.out.println(list);
        System.out.println(summe(list));
        System.out.println(groesseZumQuadrat(list));
        switchFirstAndLast(list);
        System.out.println(list);
    }

    public static int groesseZumQuadrat(ArrayList<?> liste) {
        return liste.size() * liste.size();
    }

    public static double summe(ArrayList<? extends Number> list) {
        double summe = 0;
        for (Number zahl : list) {
            summe = summe + zahl.doubleValue();
        }
        return summe;
    }

    public static void initialisiere(ArrayList<? super Integer> list, int maxNummer) {
        list.clear();
        for (int i = 0; i < maxNummer; i++) {
            list.add(i + 1);
        }
    }

    public static <T> void switchFirstAndLast(ArrayList<T> list) {
        if (list.size() < 2) {
            return;
        }
        T first = list.getFirst();
        T last = list.getLast();
        list.set(0, last);
        list.set(list.size() - 1, first);
    }
}