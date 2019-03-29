package shapes;

public class Square extends Quadrilateral {

    public void setWidth(){}
    public void setLength(){}

    public Square(int sides){
        this.length = sides;
        this.width = sides;
    }

    public void setWidth(int width){
        this.length = width;
        this.width = width;
    }

    public void setLength(int length){
        this.width = length;
        this.length = length;
    }


    public double getPerimeter() {
        return 0;
    }

    public double getArea() {

        return this.width * this.length;
    }

    /* public Square(int sides){
        this.length = sides;
        this.width = sides;
    }

    public int getArea(){

        return this.length * this.length;
    }

    public int getPerimeter(){

        return this.length * 4;
    }*/
}
