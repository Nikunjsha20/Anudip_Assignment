public class Assignment2 {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(16,20);

        System.out.println("Area of circle: "+circle.getArea());
        System.out.println("Area of square: "+square.getArea());
        System.out.println("Area of rectangle: "+rectangle.getArea());

    }
}

class Shape {

    double getArea(){
        return 0;
    }
}

class Circle extends Shape{
    int radius;

    public Circle(int radius){
        this.radius=radius;
    }


    double getArea(){
        return Math.PI*radius*radius;
    }
}

class Square extends Shape{
    int length;

    public Square(int length){
        this.length=length;
    }


    double getArea(){
        return  length*length;
    }
}

class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }

    double getArea(){
        return width*height;
    }
}
