package movies;

public class MoviesApplication {

    private String getMenu(){
        return "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - animated category movies\n" +
                "3 - drama category movies\n" +
                "4 - horror category movies\n" +
                "5 - sci/fi category movies\n";
    }






    public static void main(String[] args) {

        MoviesApplication testRun = new MoviesApplication();

        System.out.println(testRun.getMenu());


    }


}
