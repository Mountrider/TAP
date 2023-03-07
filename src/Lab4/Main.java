package Lab4;

public class Main {
    public static void main(String[] args) {
        Array array = new ComplexArray(10);
        array.add(5);
        int value = array.get(0);
        System.out.println(value); // 5

    }
}
