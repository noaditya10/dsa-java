import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        //declaring array
        int[] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));

        int[] anotherDeclarationNumb = {10,20,30};
        System.out.println(Arrays.toString(anotherDeclarationNumb));

        //printing length
        System.out.println(numbers.length);

    }
}
