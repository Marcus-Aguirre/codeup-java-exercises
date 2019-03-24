import java.util.Scanner;

public class MethodsExercises {

    public static int addition (int a, int b){

        return a + b;

    }

    public static int subtraction (int a, int b){

        return a - b;

    }

    public static int multiplication (int a, int b){

        return a * b;

    }

    public static int division (int a, int b){

        return a / b;

    }

    public static int modulus (int a, int b){

        return a % b;

    }

    public static int getInteger(int min, int max){

        System.out.format("Enter a number between %s and %s: ", min, max);

        Scanner getIntInput = new Scanner(System.in);

        int userInt = getIntInput.nextInt();

        boolean valid = false;

       do{

           if (userInt > max || userInt < min) {

               System.out.println("Your chosen integer isn't in valid range.\nPlease try again: ");

               userInt = getIntInput.nextInt();

               valid = false;

           } else {

               valid = true;

           }

       }while(!valid);

        return userInt;

    }

    public static void factorial(int num){

        for(int i = 1; i <= num; i++){

            long factorSolution = 1;

            String message = "" + i + "! = ";


            for(int x = 1; x <= i; x++){

                if(i == x){

                    factorSolution *= x;

                    message += x;

                    continue;
                }

                factorSolution *= x;

                message += x + " x ";

            }

            message += " = " + factorSolution;

            System.out.println(message);

        }
    }




    public static void main (String[] args){

        System.out.println(" 5 + 10 = " + addition(5,10));

        System.out.println(" 10 - 5 = " + subtraction(10,5));

        System.out.println(" 5 * 10 = " + multiplication(5,10));

        System.out.println(" 10 / 5 = " + division(10,5));

        System.out.println(" 10 % 5 = " + modulus(10,5));

       int newGuess = getInteger(5, 15);

       factorial(5);

    }







}
