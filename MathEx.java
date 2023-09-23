public class MathEx {  
    public static void main(String [] args){
         int y= swap(346);
        System.out.println(y);
        int x= swap (785);
        System.out.println(x);
        int w = swap(216);
        System.out.println(w);
        timeLeft(3,53,8,47);
        timeLeft(2,24,7,58);
        dayOfWeek(6,23);
        dayOfWeek(3,17);
       
    }
    public static int swap(int z){
        int result = z/100*100+z%10*10+z%100/10;
        return result;
    }
    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int x = (depHour*60+depMin)- (curHour*60+curMin);
        int y = x/60;
        int z = x%60;
        System.out.println( y+" hours "+ z+ " minutes");
    }    
    public static void dayOfWeek(int day, int date){
            int x= (date%7);
            int y= ((day+x)+7)-1;
            System.out.println(y);
    }


    }

        
    







