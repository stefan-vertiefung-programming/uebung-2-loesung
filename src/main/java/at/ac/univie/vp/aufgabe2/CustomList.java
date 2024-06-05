package at.ac.univie.vp.aufgabe2;

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

    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            T element = elements[i];
            if (element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            T element = elements[i];
            if (element.equals(o)) {
                return i;
            }
        }
        return -1;
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

    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index < 0) {
            return false;
        }
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        size = size - 1;
        return true;
    }

    public void clear() {
        size = 0;
    }

    @Override
    public String toString() {
        String elementsString = "";
        if (size > 0) {
            elementsString = elements[0].toString();
        }
        for (int i = 1; i < size; i++) {
            T element = elements[i];
            elementsString += ", " + element;
        }
        return "[" + elementsString + "]";
    }
}
