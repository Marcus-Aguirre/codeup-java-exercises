import java.util.Random;

import java.util.Scanner;

public class DiceRoller {

    public static Scanner scanner = new Scanner(System.in);


    public static int randomNumber(){

        Random randnumber = new Random();

        int random = randnumber.nextInt((6 - 1) + 1) + 1;


        return random;

    }


    public static void doubleDiceRoll() {

        boolean keepRolling = false;

        do{

            System.out.println("\nYour first dice rolled: ");
            System.out.print(randomNumber());

            System.out.println("\n\nYour second dice rolled: ");
            System.out.print(randomNumber());

            System.out.println("\n------------------------------------");

            System.out.println("Do you want to roll again? (y/n)");

            String rollAgain = scanner.next();

            if (rollAgain.equals("y")) {

                keepRolling = true;

            } else {

                keepRolling = false;

                System.out.println("\nWe hope you enjoyed your stay.");
                System.out.println("GoodBye");

            }

        }while(keepRolling);

    }



    public static void main(String[] args) {

        doubleDiceRoll();

    }


}
