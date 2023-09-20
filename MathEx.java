public class MathEx {   
    public static void main(String [] args){
        Swap();
    }
    public static void Swap(){
        int y= Swap1(465);
        System.out.println(y);
        int x= Swap1 (457);
        System.out.println(x);
        int w = Swap1(792);
        System.out.println(w);

    }
    public static int Swap1(int z){
        int result = z/100*100+z%10*10+z%100/10;
        return result;
    }
}



