public class Factorials {
    public long calcFactorial(int a){
        long product=1;
        for(int n=a;n>0;n--){
            product*=n;
        }
        return product;
    }
    public static void main(String [] args){
        Factorials f= new Factorials();

        for(int n=20;n>0;n--){
            System.out.println(f.calcFactorial(n));
        }
    }
}