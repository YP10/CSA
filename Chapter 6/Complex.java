public class Complex{
    private double a;
    private double b;

    public Complex(double one, double two){
        a=one;
        b=two;

    }
    public Complex(double one){
        a=one;
        b=0;
    }
    public double abs(){
        return Math.sqrt((a*a)+(b*b));
    }
    public Complex add(Complex other){
        return new Complex((a+other.a),(b+other.b));
    }
    public String toString(){
        return a+" "+"+"+" "+b+"i";
    }
    public Complex multiply(Complex other){
        return new Complex((a*other.a+b*other.b*-1),(b*other.a+a*other.b));
    }
    public Complex add(double Aplus, double Bplus){
        return new Complex(a+Aplus, b+Bplus);
        
    }
    public Complex multiply(double Amultiply, double Bmultiply){
        return new Complex((a*Amultiply+Bmultiply*b*-1),(Amultiply*b+Bmultiply*a));
    }
    public static void main(String []args){
        Complex c=new Complex(2,4);
        Complex c1=new Complex(3,5);
        System.out.println(c.abs());
        System.out.println(c.add(c1));
        System.out.println(c.multiply(c1));
        System.out.println(c.add(4.0,5.0));
        System.out.println(c.multiply(3,5));
    }

}
