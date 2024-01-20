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
        int sq=1;
        for(int i=n;i>0;i--){
            sq=i*i;
            System.out.print(sq+" ");
        }
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
    public void sillyNumbers3(){
        for(int i=0; i<=9;i++){
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public void dollarsAndStars(){
        for(int h=1;h<=4;h++){
            for(int i=0;i<28;i++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
    public void square(int x){
        for(int i=1;i<=x;i++){
            for(int j=i;j<=x;j++){
                System.out.print(j);
            }
        

            for(int k=1;k<i;k++){
                System.out.print(k);
            }
            
        System.out.println(" ");
        }          
    }



    public static void main(String [] args){
        ForLoops f=new ForLoops();

        System.out.println("Add Evns");
        System.out.println(f.addEvens(8));
        System.out.println(f.addEvens(9));
        System.out.println(f.addEvens(5));
        System.out.println(" ");

        System.out.println("Squares Backwards");
        f.printSquaresBack(8);
        f.printSquaresBack(3);
        f.printSquaresBack(6);
        System.out.println(" ");

        System.out.println("Silly Numbers");
        f.sillyNumbers();
        System.out.println(" ");

        System.out.println("Silly Numbers 2");
        f.sillyNumbers2();
        f.sillyNumbers3();
        System.out.println(" ");
       
        f.square(7);
        }

    }

