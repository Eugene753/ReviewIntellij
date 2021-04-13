package reviewclass09.demo1;

public class Parent {

    double PI=3.14;

    double calculateArea(double length,double width){
        return length*width;
    }
}

class Child extends Parent{

    double area(double height,double width, double length){
        return height*super.calculateArea(length,width);
    }

    double calculateArea(double radius){
        return super.PI*radius*radius;
    }

}
