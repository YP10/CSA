public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(double radius, double height){
        this.base =  new Circle(radius);
        this.height = height;
    }

    public double vol(){
        double volume = base.Area()*height;
        return volume;
    }

    public double sa(){
        double surfaceArea= base.Circumference()*height+2*base.Area();
        return surfaceArea;
    }
}
