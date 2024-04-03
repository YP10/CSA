public class Poem {
    private int numLines;

    public Poem(){
        numLines=0;
    }

    public Poem(int lines){
        numLines=lines;
    }
    public int getNumLines(){
        return numLines;
    }
    public void printRhythm(){
        System.out.println("Free Verse!");
    }
}
