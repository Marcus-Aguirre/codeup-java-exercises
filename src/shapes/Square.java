package shapes;

public class Square extends Rectangle {

    public Square(int sides){
        this.length = sides;
        this.width = sides;
    }

    public int getArea(){

        return this.length * this.width;
    }

    public int getPerimeter(){

        return this.length * 4;
    }
}
