public class Abstract {
    public static void main(String[] args){
        Circle c = new Circle(2);
        Triangle t = new Triangle(2,3);
        Square s = new Square(5);

        System.out.println(c);
        System.out.println(t);
        System.out.println(s);
    }
}

abstract class Shape{
    
    abstract double area(); // ABSTRACT

    void display(){ // CONCRETE
        System.out.println("This is a shape");
    }

}

class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double area(){
        return Math.PI * Math.pow(radius,2);
    }

    public String toString(){
        return "Area of a Circle: " + area();
    }
}

class Triangle extends Shape{

    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    double area(){
        return 0.5 * base * height; 
    }

    public String toString(){
        return "Area of a Triangle: " + area();
    }
}

class Square extends Shape{

    double length;

    Square(double length){
        this.length = length;
    }

    double area(){
        return Math.pow(length,2);
    }

    public String toString(){
        return "Area of a Square: " + area();
    }
}
