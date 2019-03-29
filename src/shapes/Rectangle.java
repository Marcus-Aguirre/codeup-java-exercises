package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    public void setWidth() {

    }

    public void setLength() {

    }

    public double getPerimeter() {
        return this.length * this.width;
    }

    public double getArea() {
        return 0;
    }



/* public int length;
    public int width;

    public Rectangle(){

    }
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    } */

}
