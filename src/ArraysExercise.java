import java.util.Arrays;

public class ArraysExercise {


    public static Person[] addPerson(Person[] array, Person adding){
        Person[] newArray;

        newArray = Arrays.copyOf(array, array.length +1);
        newArray[array.length] = adding;

        return newArray;
    }



    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));

        System.out.println();

        Person Marcus = new Person("Marcus");
        Person SecondMarcus = new Person("Second Marcus");
        Person ThirdMarcus = new Person("Third Marcus");
        Person FourthMarcus = new Person("Fourth Marcus");


        Person[] people = {Marcus, SecondMarcus, ThirdMarcus};


        for(int i = 0; i < people.length; i++){
            System.out.println(people[i].getName());
        }

        System.out.println();

        Person[] newArray = ArraysExercise.addPerson(people, FourthMarcus);

        for(int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i].getName());
        }





    }







}
