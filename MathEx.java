public class MathEx {   
    public static void main(String [] args){
        Swap(579);
        Swap(173);
        Swap(432);
    }
    public static void Swap(int z){
        System.out.println(z/100*100+z%10*10+z%100/10);
    }
}
