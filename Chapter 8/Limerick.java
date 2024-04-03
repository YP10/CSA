public class Limerick extends Poem {

    public Limerick(){
        super(5);
    }

    public int getSyllables(int k){
        if(getNumLines()==2||getNumLines()%2!=0){
            k=9;
        }
        else{
            k=6;
        }
        return k;
    }

    public void printRhythm(){

    }
}
