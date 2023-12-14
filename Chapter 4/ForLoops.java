public class ForLoops {
    public int addEvens(int n){
        int sum=0;
        if(n%2==0){
            for(int i=2;i<=n;i+=2){
            sum+=i;
            }
        }
        else if(n%2!=0){
            int oddN=n-1;
            for(int i=2;i<=oddN;i+=2){
                sum+=i;
            }
        }
        return sum;
    }
    public void printSquaresBack(int n){
        for(int i=n;i>0;i--){
            int sq=1;
            sq=i*i;
            System.out.print(sq+" ");
        }
        System.out.println();
    }
    public void sillyNumbers(){
        for(int a=0;a<3;a++){   
            for(int i=0;i<=9;i++){
                System.out.print(""+i+i+i);
            }
        System.out.println();
        }
    }
    public void sillyNumbers2(){
        for(int i=0; i<4;i++){
            for(int j=9;j>0;j--){
                for(int x=0;x<j;x++)
                    System.out.print(j);
            }
            System.out.println();
        }
    }
    public void dollarsAndStars(){
        for(int h=0; h<7; h++){ 
            for(int a=0;a<h;a++){
                System.out.print("**");
            }
            for(int x=7;x>h;x--){
                System.out.print("$");
            }
            for(int b=7;b>h;b--){
                System.out.print("**");
            }
            for(int y=7;y>h;y--){
                System.out.print("$");
            }
            for(int c=0;c<h;c++){
                System.out.print("**");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        ForLoops f=new ForLoops();

        System.out.println("Add Evens");
        System.out.println(f.addEvens(8));
        System.out.println(f.addEvens(9));
        System.out.println(f.addEvens(5));
        System.out.println(" ");

        System.out.println("Squares Backwards");
        f.printSquaresBack(8);
        f.printSquaresBack(3);
        f.printSquaresBack(6);
        System.out.println("");

        System.out.println("Silly Numbers");
        f.sillyNumbers();
        System.out.println(" ");

        System.out.println("Silly Numbers 2");
        f.sillyNumbers2();
        System.out.println(" ");

        System.out.println("Dollars and Stars");
        f.dollarsAndStars();
    }
}

    

