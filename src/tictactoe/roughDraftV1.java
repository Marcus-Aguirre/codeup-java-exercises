package tictactoe;
import java.util.Scanner;

public class roughDraftV1 {

    public static char gridOne = '1';
    public static char gridTwo = '2';
    public static char gridThree = '3';
    public static char gridFour = '4';
    public static char gridFive = '5';
    public static char gridSix = '6';
    public static char gridSeven = '7';
    public static char gridEight = '8';
    public static char gridNine = '9';
    public static Scanner scanner = new Scanner(System.in);

    public static void board(){

        System.out.println();
        System.out.format(" %s  | %s  | %s ", gridOne, gridTwo, gridThree);
        System.out.format("\n--------------\n");
        System.out.format(" %s  | %s  | %s ", gridFour, gridFive, gridSix);
        System.out.format("\n--------------\n");
        System.out.format(" %s  | %s  | %s ", gridSeven, gridEight, gridNine);
        System.out.println();

        System.out.print("\nPlease choose a grid number to place your symbol (X/O): ");
        String playerMove = scanner.next();

    }


    public static void main(String[] args) {

        board();

    }



}
