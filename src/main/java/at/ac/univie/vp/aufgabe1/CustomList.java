package at.ac.univie.vp.aufgabe1;

public class CustomList<T> {

    private final int maximumSize;
    private final T[] elements;

    private int size = 0;

    public CustomList(int maximumSize) {
        this.maximumSize = maximumSize;
        this.elements = (T[]) new Object[maximumSize];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(T element) {
        if (size >= maximumSize) {
            System.out.println("Out of bounds");
            return false;
        }
        elements[size] = element;
        size = size + 1;
        return true;
    }

    public T get(int index) {
        if (index >= size) {
            return null;
        }
        return elements[index];
    }

    public void clear() {
        size = 0;
    }
}
