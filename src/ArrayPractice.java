import java.util.Arrays;

public class ArrayPractice {


    public static void main(String[] args) {

        int[] numbers = new int[10];

        Arrays.fill(numbers, 9);

        System.out.println(Arrays.toString(numbers));


        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }







}
