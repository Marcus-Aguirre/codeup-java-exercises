package util;

import java.util.Scanner;

public class Input {

    private Scanner instanceScanner;


    public Input (){
        instanceScanner = new Scanner(System.in);
    }


    public String getString(){

        System.out.println("Please enter a string: ");
        String getStringInput = instanceScanner.nextLine();
        return getStringInput;

    }


    public boolean yesNo(){

        System.out.println("Please enter yes or no: ");
        String getStringInput = instanceScanner.next();
        return getStringInput.equalsIgnoreCase("yes")

                || getStringInput.equalsIgnoreCase("Y");

    }


    public int getInt(int min, int max){

           System.out.format("Please enter a number between %s and %s: ", min, max);

           int getIntInput = instanceScanner.nextInt();

       while(getIntInput > max || getIntInput < min) {

           System.out.format("Invalid input, Please enter a number between %s and %s: ", min, max);

           getIntInput = instanceScanner.nextInt();

       }

        return getIntInput;

    }


    public int getInt(){

        System.out.println("Please enter a random number: ");

        int getRandomIntInput = instanceScanner.nextInt();

        return getRandomIntInput;

    }


    public double getDouble(double min, double max){

        System.out.format("Please enter a number between %s and %s: ", min, max);

        double getDoubleInput = instanceScanner.nextDouble();

        while(getDoubleInput > max || getDoubleInput < min) {

            System.out.format("Invalid input, Please enter a new number between %s and %s: ", min, max);

            getDoubleInput = instanceScanner.nextDouble();

        }

        return getDoubleInput;

    }


    public double getDouble(){

        System.out.println("Please enter a random number with a floating point: ");

        double getRandomDoubleInput = instanceScanner.nextDouble();

        return getRandomDoubleInput;

    }


    public static void main(String[] args){



    }
}
