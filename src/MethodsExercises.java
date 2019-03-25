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

        ////// BOOLEAN USED FOR USER CONTINUE LATER ///////

        boolean userContinue = true;

        do {

            //////// OUTER FOR LOOP //////

            for(int i = 1; i <= num; i++){

                long factorSolution = 1;

                String message = "" + i + "! = ";


                ////// INNER FOR LOOP //////////

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

            /////////// USER CONTINUE CONDITIONAL ////////

            System.out.println("Do you want to continue? (y/n)");

            Scanner userCon = new Scanner(System.in);

            String userCont = userCon.next();

            /////////// IF/ELSE FOR USER CONTINUE ////////

            if(userCont.equals("y")){

                System.out.println("Choose a new number to factorial: ");

                int newUserInt = userCon.nextInt();

                num = newUserInt;

                userContinue = true;

            }else{

                userContinue = false;
            }

            //////// USER CONTINUE BEGINS AT FALSE, WILL ONLY RUN AGAIN IF USER ENTERS "y" //////

        }while(userContinue);
    }



    public static void main (String[] args){

        System.out.println(" 5 + 10 = " + addition(5,10));

        System.out.println(" 10 - 5 = " + subtraction(10,5));

        System.out.println(" 5 * 10 = " + multiplication(5,10));

        System.out.println(" 10 / 5 = " + division(10,5));

        System.out.println(" 10 % 5 = " + modulus(10,5));

       int newGuess = getInteger(5, 15);
       
       factorial(5);

       int x = getInteger(5, 15);

        System.out.println(x);

       /* String cee = "c";
        char see = 'c';

        System.out.println(cee.equals(cee));*/

    }







}
