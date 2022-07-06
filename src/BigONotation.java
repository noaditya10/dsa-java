public class BigONotation {
    // CONSTANT : O(1)
    public void input1(int[] numbers) {
        System.out.println();
    }

    // LINEAR : O(n+1) or O(n) because 1 is not significant if n is millions
    public void input2(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();
    }

    // O(n+m) or O(n) because its linear growing
    public void input3(int[] numbers, String[] names) {
        for (int number : numbers) {
            System.out.println(number);
        }
        for (String name : names) {
            System.out.println(name);
        }
    }

    //QUADRATIC : O(n^2)
    public void input4(int[] numbers) {
        for (int first : numbers) {
            for (int second : numbers) {
                System.out.println(first + ", " + second);
            }
        }
    }

}
