public class Practicew {
    public int limitAmplitude(int limit){
        int count=0;
        int length=samples.length;
        int negLimit=limit*-1;
        for(int i=0;i<length;i++){
            if(samples[i]>limit){
                count++;
            }
            if(samples[i]<negLimit){
                count++;
            }
        }
        return count;
    }
    public void trimSilenceFromBeginning(){
        int leadingZeros=0;
        for(int i=0; samples[i]==0;i++){
            leadingZeros++;
            }
        }
        int [] samples1=new int[samples.length-leadingZeros];
        for(int j=0; j<samples1.length;j++){
            samples1[j]=samples[leadingZeros];
            leadingZeros++;
        }

    }
    public String mostValuableNeighbor(int r, int c){
        int value=0;
        int a=0;
        int b=0;
        int start=c-1;
        int end=c+1;
        if(isValid(r,c-1)==false) start=c;
        if(isValid(r,c+1)==false)end=c;
        for(int i=start;i<=end;i++){
            int oldValue=value;
            value=grid[r][i].getValue();
            if(value>oldValue){
                a=r;
                b=i;
            }
            else{
                value=oldValue;
            }
        }
        return grid[a][b].getName();
            
    }
    public double findAverage() {
        double sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sum+=grid[i][j].getValue;
            }
        }
        return sum/(grid.length*grid[0].length);
    }
}


