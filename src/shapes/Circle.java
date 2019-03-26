package shapes;

import util.Input;

public class Circle {

    private double radius;
    private static double pi = 3.141592;

    public Circle(double radius){

        this.radius = radius;

    }

    public double getArea(){

        return pi * (radius * radius);

    }

    public double getCircumference(){

        return 2 * pi * radius;

    }




    public static void main(String[] args) {
        Circle square = new Circle(5);

        System.out.println(square.getArea());
        System.out.println(square.getCircumference());

    }




}
