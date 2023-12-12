public class ForLoops {
    public int addEvens(int n){
        int sum=0;
        for(int i=2;i>=n;i++){
            sum+=i;
        }
        return sum;
    }
}
