public class SoccerTeam {
    private int wins;
    private int loss;
    private int ties;
    private static int numGoals;
    private static int numGames;

    public SoccerTeam(){
        wins=0;
        loss=0;
        ties=0;
    }
    public void startTournament(){
        numGames=0;
        numGoals=0;
    }
    public void played(SoccerTeam other, int myScore, int otherScore){
        numGoals+=myScore+otherScore;
        numGames++;

        if(myScore==otherScore){
            ties++;
            other.ties++;
        }
        else if(myScore>otherScore){
            wins++;
            other.loss++;
        } 
        else if(myScore<otherScore){
            other.wins++;
            loss++;
        }

    }
    public int currPts(){
        return wins*3+ties;
    }
    public void reset(){
        wins=0;
        ties=0;
        loss=0;
    }
    public static int getNumGames(){
        return numGames;
    }
    public static int getNumGoals(){
        return numGoals;
    }
    public static void main(String []args){
        SoccerTeam s=new SoccerTeam();
        SoccerTeam s1= new SoccerTeam();
        SoccerTeam s2= new SoccerTeam();
        SoccerTeam s3= new SoccerTeam();

        s.startTournament();
        System.out.println("Tournament 1");
        s.played(s1,9,7);
        s2.played(s3,5,7);
        s3.played(s2,5,5);
        s1.played(s2,6,7);
        System.out.println("Wins: "+s.wins+"; Losses: "+s.loss+"; Ties: "+s.ties+"; Current Points "+s.currPts());
        System.out.println("Wins: "+s1.wins+"; Losses: "+s1.loss+"; Ties: "+s1.ties+"; Current Points "+s1.currPts());
        System.out.println("Wins: "+s2.wins+"; Losses: "+s2.loss+"; Ties: "+s2.ties+"; Current Points "+s2.currPts());
        System.out.println("Wins: "+s3.wins+"; Losses: "+s3.loss+"; Ties: "+s3.ties+"; Current Points "+s3.currPts());
        System.out.println("Number of Games: "+getNumGames());
        System.out.println("Number of Goals: "+getNumGoals());
        s.reset();
        s1.reset();
        s2.reset();
        s3.reset();

        System.out.println();
        
        s.startTournament();
        System.out.println("Tournament 2");
        s.played(s1,3,3);
        s2.played(s3,1,4);
        s3.played(s2,6,2);
        s1.played(s2,4,2);
        System.out.println("Wins: "+s.wins+"; Losses: "+s.loss+"; Ties: "+s.ties+"; Current Points "+s.currPts());
        System.out.println("Wins: "+s1.wins+"; Losses: "+s1.loss+"; Ties: "+s1.ties+"; Current Points "+s1.currPts());
        System.out.println("Wins: "+s2.wins+"; Losses: "+s2.loss+"; Ties: "+s2.ties+"; Current Points "+s2.currPts());
        System.out.println("Wins: "+s3.wins+"; Losses: "+s3.loss+"; Ties: "+s3.ties+"; Current Points "+s3.currPts());
        System.out.println("Number of Games: "+getNumGames());
        System.out.println("Number of Goals: "+getNumGoals());
    }
}
