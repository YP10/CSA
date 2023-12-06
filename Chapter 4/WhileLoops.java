public class WhileLoops{
    public int addOdds(int n){
        int sum=0;
        int i= 1;
        while(i<=n){
            sum+=i;
            i+=2;
        }
        return sum;
    }
    public int sumDigits(int x){
        int sum=0;  
        while(x>0){
            int y=x%10;
            sum+=y;
            x/=10;
        }
        return sum;
    }
    public int howManyYears(double startpop, double endpop){
        int numYears=0;
        while(endpop>startpop){
            startpop=startpop*.0113+startpop;
            numYears++;
        }
        
        return numYears;
    }
    public void printSum(int n){
        int sum=0;
        int x=0;
        while(n>x){
            x++;
            
            if(x==n) System.out.print(x+" ");
            else System.out.print(x+" "+"+"+" ");

            sum+=x;
        }
        System.out.println("="+" " + sum);
    }
    public boolean isPerfectSquare(int n){
        int sum=0;
        int i=1;
        while(n>sum){
            sum+=i;
            i+=2;
        }
        if(sum==n) return true;
        else return false;
    }
    public static void main(String [] args){
        WhileLoops w= new WhileLoops();
       
        System.out.println("Add Odds");
        System.out.println(w.addOdds(7));
        System.out.println(w.addOdds(3));
        System.out.println(w.addOdds(6));
        System.out.println(" ");

        System.out.println("Sum Digits");
        System.out.println(w.sumDigits(457));
        System.out.println(w.sumDigits(65));
        System.out.println(w.sumDigits(4296));
        System.out.println(" ");

        System.out.println("How Many Years");
        System.out.println(w.howManyYears(111.2, 120));
        System.out.println(w.howManyYears(111.2, 150));
        System.out.println(" ");
        
        System.out.println("Print Sum");
        w.printSum(6);
        w.printSum(8);
        w.printSum(12);
        System.out.println(" ");

        System.out.println("Is Pefect Square");
        System.out.println(w.isPerfectSquare(25));
        System.out.println(w.isPerfectSquare(49));
        System.out.println(w.isPerfectSquare(37));
        System.out.println(w.isPerfectSquare(43));
    }
}
