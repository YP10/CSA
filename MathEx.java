public class MathEx {  
    public static void main(String [] args){
        System.out.println(swap(482));
        System.out.println(swap(860));
        System.out.println(swap(234));
        timeLeft(3,53,8,47);
        timeLeft(2,24,7,58);
        System.out.println(dayOfWeek(2,23));
        System.out.println(dayOfWeek(3,17));
    }
    public static int swap(int curDigits){
        int hundreds = curDigits/100*100;
        int tens = curDigits%10*10;
        int ones = curDigits%100/10;
        int newDigits = hundreds + tens + ones;
        return newDigits;
    }
    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int totalDepMinutes = ((depHour*60)+depMin);
        int totalCurMinutes = ((curHour*60)+curMin);
        int timeDif = totalDepMinutes - totalCurMinutes;
        int hours = timeDif/60;
        int minutes = timeDif%60;
        System.out.println( hours+" hour(s) "+ minutes+ " minute(s)");
    }    
    public static int dayOfWeek(int day, int date){
            int partOfWeek= (date+day)-1;
            int weekDay= partOfWeek%7;
            return weekDay;
    }
}