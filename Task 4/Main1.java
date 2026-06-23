interface Shape{
    double calculateArea();
}
class Rectangle implements Shape{
    double length;
    double width;

    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public double calculateArea(){
        return length*width;
    }
}
class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
class AreaCalculator{
   double calculateTotalArea(Shape[]shapes){
       double totalArea=0;
       for(Shape shape : shapes){
        totalArea+=shape.calculateArea();
       }
       return totalArea;

    }
}

public class Main1 {
    public static void main(String[] args) {
        Shape[]  shapes = {
            new Rectangle(10,4),
            new Circle(7)
        };

        AreaCalculator calculator= new AreaCalculator();

        System.out.println(calculator.calculateTotalArea(shapes));
    }
}

