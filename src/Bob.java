import java.util.Scanner;

public class Bob {

    public static void main (String[] args){

        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Hi, Im Bob.");

        do{

            System.out.println("Ask me anything: ");

            String userInput = userInputScanner.nextLine();

            if(userInput.endsWith("?")){

                System.out.println("Sure");

            }else if(userInput.endsWith("!")){

                System.out.println("Woah, chill out my dude!");

            }else if(userInput.equals("")){

                System.out.println("The silent treatment? Fine, be that way.");

            }else{

                System.out.println("Whatever, my dude.");

            }

        }while(true);

    }
}
