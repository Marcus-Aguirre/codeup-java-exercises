import java.util.Arrays;

public class ArraysExercise {


    /////////// METHOD TO TAKE IN AN ARRAY AND AN OBJECT ///////////
    /////////// AND MAKE A NEW ARRAY THAT COMBINES THEM  ///////////

    public static Person[] addPerson(Person[] array, Person adding){

        Person[] newArray;

        newArray = Arrays.copyOf(array, array.length +1);

        newArray[array.length] = adding;

        return newArray;
    }

    ///////// MEGANS VERSION / PERFECT CODE /////////
    /*public static Person[] addPerson(Person[] objects, Person addNewb){


        Person[] copy;
        copy = Arrays.copyOf(objects, objects.length + 1);

        copy[objects.length] = addNewb;

        return copy;

    }*/


    /////////// MAIN METHOD START ///////////

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));

        System.out.println();

        Person Marcus = new Person("Marcus");
        Person SecondMarcus = new Person("Second Marcus");
        Person ThirdMarcus = new Person("Third Marcus");
        Person FourthMarcus = new Person("Fourth Marcus");


        Person[] people = {Marcus, SecondMarcus, ThirdMarcus};


        /////////// FOR LOOP, SOUT'ing NAMES in ARRAY ///////////

        for(int i = 0; i < people.length; i++){
            System.out.println(people[i].getName());
        }


        System.out.println();


        Person[] newArray = ArraysExercise.addPerson(people, FourthMarcus);


        /////////// FOR LOOP, SOUT'ing NAMES in newArray ///////////

        for(int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i].getName());
        }





    }







}
