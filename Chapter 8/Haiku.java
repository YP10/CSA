public class Haiku extends Poem {

    public Haiku(){
        super(3);
    }
    public int getSyllables(int k){
        if(getNumLines()%2==0) k=7;
        else{
            k=5;
        }
        return k;
    }
    public void printRhythm(){
        for(int i=0;i<getNumLines();i++){
            for(int j=0;j<getSyllables();j++){
                System.out.println("ta");
            }
        System.out.println();
        }
    }
}
