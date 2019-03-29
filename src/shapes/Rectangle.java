package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width){
        super(length, width);
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setLength(int length){
        this.length = length;
    }

    public double getPerimeter(){
        return (this.length * 2) + (this.width * 2);
    }

    public double getArea(){
        return this.length * this.width;
    }

}
