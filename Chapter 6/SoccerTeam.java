public class SoccerTeam {
    int wins;
    int loss;
    int ties;
    static int numGoals;
    static int numGames;

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
            other.loss--;
        } 
        else if(myScore<otherScore){
            other.wins++;
            loss--;
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
        s.played(s1,9,7);
        s2.played(s3,5,7);
        s3.played(s2,5,5);
        s1.played(s2,6,7);
        System.out.println(s.currPts());
        System.out.println(s2.currPts());
        System.out.println(s3.currPts());
        System.out.println(s1.currPts());
        System.out.println(getNumGames());
        System.out.println(getNumGoals());
        s.reset();
        System.out.println(s.currPts());
    }
}
