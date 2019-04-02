package practice;

public class exceptionPractice {


    public static void main(String[] args) {
        String[] words = {"one", "two", "three", "four"};
        int i = 4;

        try{
            if(i < 0 || i >= words.length){
            throw new Exception("The index is out of range");
            }

            System.out.println(words[i]);
            System.out.println("We are in the \"Try\"");


        }
        catch (Exception e){
            System.out.println("There was an exception");
            System.out.println(e);

        }


    }
}
