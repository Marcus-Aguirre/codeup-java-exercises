import java.util.Random;

public class ServerNameGenerator {

   private static String[] nouns = {"Harmonica", "Sister", "Stranger", "Turret", "Tank", "Father", "Cilantro", "Universe", "Master", "Rookie"};
   private static String[] adjectives = {"Voiceless", "Discreet", "Physical", "Cheap", "Venomous", "Talented", "Ruthless", "Sullen", "Fragile", "Future"};
   private static Random rand = new Random();


   public static String newName(){
       int firstRandNum = rand.nextInt(10);
       int secondRandNum = rand.nextInt(10);

       return adjectives[firstRandNum] + "-" + nouns[secondRandNum];

   }


    public static void main(String[] args) {

        System.out.println("Your new server name is: " + ServerNameGenerator.newName());
        System.out.println("Your new server name is: " + ServerNameGenerator.newName());
        System.out.println("Your new server name is: " + ServerNameGenerator.newName());
        System.out.println("Your new server name is: " + ServerNameGenerator.newName());


    }

}
