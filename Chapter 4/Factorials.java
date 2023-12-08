public class Factorials {
    public long calcFactorial(int a){
        long product=1;
        for(int n=1;a>=n;n++){
            product*=n;
        }
        return product;
    }
    public double calcE(){
        double e=1;
        double olde=0;
        int a=1;
        while(e-olde>.001){
            olde=e;
            e+=(1.0/(calcFactorial(a)));
            a++;
            
        }
        return e;
    }
    public double calcEX(int x){
        int y=1;
        double e=1;
        double olde=0;
        int a=1;
        while(e-olde>.001){
            olde=e;
            e+=((double)Math.pow(x,y))/(calcFactorial(a));
            a++;
            y++;

        }
        return e;
    }
    public static void main(String [] args){
        Factorials f= new Factorials();

        for(int b=1;b<=20;b++){
            System.out.println(f.calcFactorial(b));
            
        }
        System.out.println(" ");
        System.out.println("Test");
        System.out.printf("e is %2.3f \n", f.calcE());
       
        for(int a=1;a<=5;a++){
            System.out.printf("e is %2.3f \n", f.calcEX(a));
        }
        
    }

}