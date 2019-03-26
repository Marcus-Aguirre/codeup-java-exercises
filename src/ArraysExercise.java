import java.util.Arrays;

public class ArraysExercise {

    ///////// CANT FIGURE OUT NOW ///// WILL TRY AGAIN LATER /////////

    /*public static Person[] addPerson(Person[] array, Person adding){
        Person[] newArray = new Person[array.length + 1];

        for(int i = 0; i < array.length; i++){

        }

        return newArray;
    }*/



    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));

        System.out.println();

        Person Marcus = new Person("Marcus");
        Person SecondMarcus = new Person("Second Marcus");
        Person ThirdMarcus = new Person("Third Marcus");

        Person[] people = {Marcus, SecondMarcus, ThirdMarcus};


        for(int i = 0; i < people.length; i++){
            System.out.println(people[i].getName());
        }






    }







}
