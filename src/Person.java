
public class Person {

        private String name;

        public String getName(){

            return this.name;

        }

        public void setName(String name){

            this.name = name;

        }

        public void sayHello(){

            System.out.format("Hello, %s", this.name);

        }






    public static void main(String[] args){

        Person marcus = new Person();

        marcus.setName("Marcus A.");

        System.out.println(marcus.getName());

        marcus.sayHello();


    }






}


