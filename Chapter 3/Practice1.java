public class Practice1 {
    public int loneSum(int a, int b, int c){
        if((a==b)&&(b==c)) return 0;
        else if(a==b) return c;
        else if(b==c) return a;
        else if(a==c) return b;
        else return a+b+c;
    }
    public int luckySum(int a, int b, int c){
        
        if(a==13) return 0;
        else if(b==13) return a;
        else if(c==13) return b+a;
        else return a+b+c;
    }
    public boolean evenlySpaced(int a, int b, int c){
        int s1= Math.abs(b-a); 
        int s2= Math.abs(c-b);  
        int s3=Math.abs(c-a); 
        if((s1==s2)||(s2==s3)||(s1==s3)){
            if((s1+s2==s3)||(s2+s3==s1)||(s1+s3==s2)) return true;
            else return false;
        }
        else return false;

    }
    public int idk(int m, int n){
        if(m+n>10) return m+n;
        if(m-n>0) return m-n;
        else return 0;
    }
    public static void main(String [] args){
        Practice1 l= new Practice1();

        System.out.println(l.loneSum(1,2,3));
        System.out.println(l.loneSum(3,2,3));
        System.out.println(l.loneSum(3,3,3));
        System.out.println(" ");
        
        System.out.println(l.luckySum(1,2,3));
        System.out.println(l.luckySum(1,2,13));
        System.out.println(l.luckySum(1,13,3));
        System.out.println(" ");

        System.out.println(l.evenlySpaced(2,4,6));
        System.out.println(l.evenlySpaced(4,6,2));
        System.out.println(l.evenlySpaced(4,6,3));
        System.out.println(l.evenlySpaced(3,7,11));
        System.out.println(" ");

        System.out.println(l.idk(8,3));





    }
}
