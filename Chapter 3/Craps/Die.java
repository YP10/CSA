package Craps;
public class Die {
        int getNumDots0;
    public void roll(){
        getNumDots0 = (int)(Math.random()*6)+1;
    }
    public int getNumDots(){
        return getNumDots0;
    }
    
    public static void main(String[] args) {
        Die die = new Die();
        die.roll();
       System.out.println(die.getNumDots());

    }
}