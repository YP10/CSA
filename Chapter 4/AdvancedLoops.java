public class AdvancedLoops {
    public void eights(){
        for(int j=8; j>=2; j-=2){
             for(int k=8;k>j;k-=2){
                System.out.print(" ");
            }
            for(int i=1;i<=j;i++){
                System.out.print(j);
            }
        System.out.println();
        }
    }
    public void alternate(int x){
        for(int i=1;i<=x;i++){
            if(i%2==0){
                for(int j=i;j>0;j--){
                        System.out.print(j);
                    }
                    System.out.println();
                }
            if(i%2!=0){
                for(int a=1;a<=i;a++){
                    System.out.print(a);
                }
                System.out.println();
            }
        }
    }
    public void isosceles(int x){
        for(int i=1;i<=x;i++){
            for(int k=1;k<x-i+1;k++){
                System.out.print(" ");
            } 
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public void upSideDown(int x, int y){
        for(int i=x;i>=y;i--){
            for(int b=1;b<=x-i;b++){ 
                System.out.print(" "); 
            }
            for(int j=i;j>y;j--){
                System.out.print(j);
            }
            for(int a=y;a<=i;a++){
                System.out.print(a);
            }
            System.out.println();
        }

    }
    public static void main(String [] args){
        AdvancedLoops t= new AdvancedLoops();
        t.eights();
        System.out.println("Alternate");
        t.alternate(5);
        t.alternate(6);
        System.out.println("Isosceles");
        t.isosceles(5);
        t.isosceles(4);
        System.out.println("Upside Down");
        t.upSideDown(9, 3);
    }
}
