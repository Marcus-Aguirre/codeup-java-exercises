package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Student Macaroni = new Student("Macaroni");
        Macaroni.addGrade(100);
        Macaroni.addGrade(92);
        Macaroni.addGrade(86);

        Student Fettuccine = new Student("Fettuccine");
        Fettuccine.addGrade(86);
        Fettuccine.addGrade(91);
        Fettuccine.addGrade(82);

        Student Linguine = new Student("Linguine");
        Linguine.addGrade(71);
        Linguine.addGrade(77);
        Linguine.addGrade(81);

        Student Ravioli = new Student("Ravioli");
        Ravioli.addGrade(89);
        Ravioli.addGrade(93);
        Ravioli.addGrade(98);

        Student Tortellini = new Student("Tortellini");
        Tortellini.addGrade(100);
        Tortellini.addGrade(98);
        Tortellini.addGrade(99);


        HashMap<String, Student> gitNameStudent = new HashMap<>();

        gitNameStudent.put("MacAttack", Macaroni);
        gitNameStudent.put("Fetterator65", Fettuccine);
        gitNameStudent.put("PastaBoy", Linguine);
        gitNameStudent.put("RavMan", Ravioli);
        gitNameStudent.put("TortoiseAndHare", Tortellini);


//        System.out.println(gitNameStudent);           //


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome");
        String tryAgain = "";

       do {
           System.out.println("Here are the github user-names of our students: ");
           System.out.println(gitNameStudent.keySet());
           System.out.println("What student would you like to see more information on?");
           String userChoice = scanner.next();

           if (userChoice.equalsIgnoreCase("MacAttack")) {

               System.out.println("Name: " + gitNameStudent.get("MacAttack").getName() + " - " + "Github Username: MacAttack");
               System.out.println("Current Average: " + gitNameStudent.get("MacAttack").getGradeAverage());


           } else if (userChoice.equalsIgnoreCase("Fetterator65")) {

               System.out.println("Name: " + gitNameStudent.get("Fetterator65").getName() + " - " + "Github Username: MacAttack");
               System.out.println("Current Average: " + gitNameStudent.get("Fetterator65").getGradeAverage());


           } else if (userChoice.equalsIgnoreCase("PastaBoy")) {

               System.out.println("Name: " + gitNameStudent.get("PastaBoy").getName() + " - " + "Github Username: MacAttack");
               System.out.println("Current Average: " + gitNameStudent.get("PastaBoy").getGradeAverage());


           } else if (userChoice.equalsIgnoreCase("RavMan")) {

               System.out.println("Name: " + gitNameStudent.get("RavMan").getName() + " - " + "Github Username: MacAttack");
               System.out.println("Current Average: " + gitNameStudent.get("RavMan").getGradeAverage());


           } else if (userChoice.equalsIgnoreCase("TortoiseAndHare")) {

               System.out.println("Name: " + gitNameStudent.get("TortoiseAndHare").getName() + " - " + "Github Username: MacAttack");
               System.out.println("Current Average: " + gitNameStudent.get("TortoiseAndHare").getGradeAverage());


           } else {
               scanner.next();
               System.out.println("Error, there is no user with that name.");
           }
           System.out.println("Do you want to try again? (y/n)");
           tryAgain = scanner.next();

       }while(tryAgain.equalsIgnoreCase("y"));

        System.out.println("GoodBye");































    }



}
