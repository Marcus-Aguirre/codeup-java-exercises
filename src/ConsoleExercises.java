import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");

        int userInput = scanner.nextInt();

        int fiveLess = userInput - 5;

        System.out.format("The number %s is five numbers less than the number you chose.\n", fiveLess);

        System.out.format("The value of pi is approximately %s!\n", pi);

        System.out.print("Enter the length and width of the Codeup Classroom: ");


        Scanner one = new Scanner(System.in);

        int length = one.nextInt();

        int width = one.nextInt();

        int total = length * width;

        int perimeter = (length * 2) + (width * 2);



        System.out.format("The area of the Codeup Classroom is %sft, and the perimeter is %sft.", total, perimeter);



    }

}
