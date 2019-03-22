import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {


        /////////// WHILE LOOP ///////////

        int whileFive = 5;

        while (whileFive <= 6) {
            System.out.println("WhileFive is " + whileFive);
            whileFive++;
        }



        /////////// DO-WHILE LOOP ///////////

        int doWhile = 0;

        do {
            System.out.println("The current doWhile is: " + doWhile);
            doWhile += 2;
        } while (doWhile <= 2);



        /////////// FOR LOOP ///////////

        for(int forNumber = 0; forNumber <= 1; forNumber++){

            System.out.println("The forNumber is: " + forNumber);

        }



        /////////// FIZZ BUZZ / FOR LOOP ///////////

        for(int fizzbuzz = 1; fizzbuzz <= 50; fizzbuzz++){

            if(fizzbuzz % 15 == 0){

                System.out.println("FIZZ-BUZZ");

            }else if(fizzbuzz % 5 == 0){

                System.out.println("BUZZ");

            }else if(fizzbuzz % 3 == 0){

                System.out.println("FIZZ");

            }else{

                System.out.println(fizzbuzz);

            }


        }


        /////////////// TABLE OF POWERS ////////////////

        Scanner tableTo = new Scanner(System.in);

        System.out.print("Choose a number: ");

        int numberTo = tableTo.nextInt();


        System.out.println("\nHere is your table!!\n");

        System.out.println(" number| squared| cubed ");
        System.out.println("---------------------------");

        int numberUp = 0;

        for(int i = numberTo; i > 0; i--){

            numberUp++;

            int squared = numberUp * numberUp;

            int cubed = numberUp * numberUp * numberUp;

            System.out.format("%-6d | %-6d | %-6d\n", numberUp, squared, cubed);

             /*if (numberTo == numberUp) {

                Scanner toContinue = new Scanner(System.in);

                System.out.println("Do you want to continue?");

                String userContinue = toContinue.next();


                if (userContinue.equals("yes")) {

                    numberUp = 0;

                    System.out.print("Choose a number: ");

                    numberTo = dgo.nextInt();

                    i = numberTo;

                    System.out.println("\nHere is your table!!\n");

                    System.out.println(" number| squared| cubed ");
                    System.out.println("---------------------------");



                    continue;

                } else {

                    break;
                }*/

        }




        /////////////// NUMERICAL GRADE CONVERTER ////////////////

        System.out.println("Enter a numerical grade from 0 - 100: ");

        Scanner numberToGrade = new Scanner(System.in);

        int numericalGrade = numberToGrade.nextInt();


        if(numericalGrade >= 88){

            System.out.println("The score is an \"A\".");

        }else if(numericalGrade >= 80 & numericalGrade < 87){

            System.out.println("The score is an \"B\".");

        }else if(numericalGrade >= 67 & numericalGrade < 79){

            System.out.println("The score is an \"C\".");

        }else if(numericalGrade >= 60 & numericalGrade < 67){

            System.out.println("The score is an \"D\".");

        }else if(numericalGrade <= 59){

            System.out.println("The score is an \"F\".");

        }




    }

}