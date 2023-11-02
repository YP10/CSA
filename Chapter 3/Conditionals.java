public class Conditionals {
    public boolean chimpTrouble(boolean aSmile, boolean bSmile){
        if(aSmile==bSmile) return true;
        else return false;
    }  
    public boolean negPos(int a, int b,boolean c){
        if((a*b<0)&&(c==false)) return true;
            if ((c==true)&&(a<0)&&(b<0)) return true;
        else return false;
    }
    public  boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if(isAsleep==true) return false;
        if((isMorning==true)&&(isMom==false)) return false;
        else return true;
    }
    public String setAlarm(int dayOfWeek,boolean vacation){
        String string10="10:00";
        String string7= "7:00";
        String stringOff="off";
        boolean weekend= (dayOfWeek==0)||(dayOfWeek==6);
        boolean weekday= (dayOfWeek>0)&&(dayOfWeek<6);
        if((weekend)&&(vacation==true)) return stringOff;
        if((weekday)&&(vacation==false)) return string7;
        else return string10;  
    }
    public boolean onesDigitSame(int a, int b, int c){
        int onesA= a%10;
        int onesB=b%10;
        int onesC=c%10;
        if((onesA==onesB)||(onesA==onesC)||(onesB==onesC)) return true;
        if((onesA==onesB)&&(onesB==onesC)) return true;
        else return false;
    }
    public int blackjack(int x, int y){
        int closestX= 21-x;
        int closestY= 21-y;
        if(x>21&&y>21) return 0;
        if(closestY>closestX){
            if(closestX<0)return y;
            else return x;
        }
       if(closestY<0)return x;
        else return y;
    }

    public static void main(String[] args){
        Conditionals c= new Conditionals();
        
        System.out.println("Chimp Trouble");
        System.out.println(c.chimpTrouble(true, true));
        System.out.println(c.chimpTrouble (false, false));
        System.out.println(c.chimpTrouble (true, false));
        System.out.println(c.chimpTrouble (false, true));
        System.out.println();


        System.out.println("Negative Position");
        System.out.println(c.negPos(1, -1, false));
        System.out.println(c.negPos (-1, 1, false));
        System.out.println(c.negPos(1, 1, false));
        System.out.println(c.negPos (-1, -1, false));
        System.out.println(c.negPos (-4, -5, true));
        System.out.println(c.negPos (-4, 5, true));
        System.out.println(c.negPos (4, 5, true));
        System.out.println(c.negPos (4, -5, true));
        System.out.println();


        System.out.println("Pick Up the Phone");
        System.out.println(c.pickUpPhone (false, false, true));
        System.out.println(c.pickUpPhone (true, true, true));
        System.out.println(c.pickUpPhone (true, true, false));
        System.out.println(c.pickUpPhone (false, true, false));
        System.out.println(c.pickUpPhone (true, false, false));
        System.out.println(c.pickUpPhone (false, false, false));
        System.out.println();


        System.out.println("Set Alarm");
        System.out.println(c.setAlarm(1, false));
        System.out.println(c.setAlarm(5, false));
        System.out.println(c.setAlarm (0, false));
        System.out.println(c.setAlarm (2, true));
        System.out.println(c.setAlarm (4, true));
        System.out.println(c.setAlarm (6, true));
        System.out.println();

        System.out.println("Ones Digit");
        System.out.println(c.onesDigitSame(23, 19, 13));
        System.out.println(c.onesDigitSame (23, 19, 12));
        System.out.println(c.onesDigitSame (23, 19, 3) );
        System.out.println(c.onesDigitSame (423, 13, 3));
        System.out.println(c.onesDigitSame (23, 29, 25) );
        System.out.println();

        System.out.println("Blackjack");
        System.out.println(c.blackjack(19, 21));
        System.out.println(c.blackjack(21, 19));
        System.out.println(c.blackjack(19, 22));
        System.out.println(c.blackjack(8, 8));
        System.out.println(c.blackjack(25, 24));
        System.out.println(c.blackjack(17, 9));
        System.out.println(c.blackjack(12, 18));
       
    }
}



