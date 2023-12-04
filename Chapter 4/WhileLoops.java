public class WhileLoops{
    public int addOdds(int n){
        int i= -1;
        int sum=0;
        while(i<=n){
            i+=2;
            sum+=i;
        }
        return sum;
    }
    public static void main(String [] args){
        WhileLoops w= new WhileLoops();
        System.out.println(w.addOdds(7));
    }
}
