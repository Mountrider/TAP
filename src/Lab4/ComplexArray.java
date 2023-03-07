package Lab4;

public class ComplexArray implements Array {
    private int[] elements;
    private int size;

    public ComplexArray(int length) {
        this.elements = new int[length];
        this.size = 0;
    }

    @Override
    public void add(int element) {
        this.elements[size++] = element;
    }

    @Override
    public int get(int index) {
        return this.elements[index];
    }

    @Override
    public int size() {
        return this.size;
    }
}

