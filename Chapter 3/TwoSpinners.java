public class TwoSpinners {
    /** Precondition: min < max
  	*/
 	/*The spin method simulates a spin of a fair spinner.
  	* The method returns a random integer between min and max,
  	* inclusive. Complete the spin method below by assigning
  	* this random integer to result.
  	*/
    public int spin(int min, int max){
        int result=0;
        int range= max-min+1;
        result=(int)((Math.random()*(range))+min);
        return result;
    }

    public void playRound(){
        int compSpin= spin(2,8);
        int playerSpin= spin(1,10);
        if(playerSpin>compSpin) System.out.println("You Win! "+(playerSpin-compSpin)+" points");
        else if(compSpin>playerSpin) System.out.println("You lose. "+(playerSpin-compSpin)+" points.");
        else if(compSpin==playerSpin){
            int compSpin0= spin(2,8);
            int playerSpin0= spin(1,10);
                if(playerSpin0>compSpin0) 
                    System.out.println("You Win! +1 point");
                else if(compSpin0>playerSpin0) 
                    System.out.println("You lose. -1 point.");
                else System.out.println("Tie. 0 points");
        }                                                                                           
    }
 
    
    public static void main(String[] args) {
        TwoSpinners ds = new TwoSpinners();
            for(int i = 0; i < 10; i++){    //This will save you time by running playground 10 times
              ds.playRound();
            }
    }
}



