public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius= radius;
    }
    public double Circumference(){
        double Circum = Math.PI*2*radius;
        return Circum;
    }
    public double Area(){
        double circleArea=Math.PI*radius*radius;
        return circleArea;
    }
 }  















