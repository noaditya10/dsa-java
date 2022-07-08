package dynamicArray;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);

        numbers.insert(11);
        numbers.insert(21);
        numbers.insert(32);
        numbers.insert(42);
        numbers.removeAt(5);
        numbers.print();
    }
}
