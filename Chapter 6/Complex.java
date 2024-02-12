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
        Complex a=new Complex(3,-6);
        Complex a1=new Complex(-1,9);

        Complex b=new Complex(2,4);
        Complex b1=new Complex(-7,-5);

        Complex c1=new Complex(-3);
        Complex c2=new Complex(0,5);

        System.out.println("1: "+a+a1+"; Add: "+a.add(a1)+"; Multiply: "+a.multiply(a1));

        
       
    }

}
