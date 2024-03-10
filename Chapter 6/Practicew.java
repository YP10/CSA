public class Practicew {
    public int limitAmplitude(int limit){
        int count=0;
        int length=samples.length;
        for(int i=0;i<length;i++){
            if(samples[i]>limit||samples[i]<limit*-1){
                count++;
            }

        }
    }
    public void trimSilenceFromBeginning(){
        int leadingZeros=0;
        for(int i=0; i<samples.length;i++){
            if(i>0){
                leadingZeros=i;
                break;
            }
        }
        int [] samples1=new int[samples.length-leadingZeros];
        for(int j=0; j<samples1.length;j++){
            samples1[j]=samples[leadingZeros];
            leadingZeros++;
        }

    }
}


