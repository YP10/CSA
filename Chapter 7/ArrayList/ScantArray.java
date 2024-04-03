package ArrayList;
import java.util.ArrayList;



public class ScantArray {
    private int numRows;
    private int numColumns;

    private ArrayList<ScantArrayEntry> entries;

    public ScantArray(int r, int c){
        numRows = r;
        numColumns = c;
        entries = new ArrayList<ScantArrayEntry>();
    }

    public int getNumRows(){return numRows;}
    public int getNumColumns(){return numColumns;}

    public void addEntry(int row, int col, int val){
        entries.add(new ScantArrayEntry(row, col, val));
    }

    public int getValueAt(int row, int col){
        for(int i=0;i<entries.size();i++){
            ScantArrayEntry x=entries.get(i);
            if(x.getRow()==row&&x.getColumn()==col){ 
                return x.getValue();
            }
        }
        return 0; 
    }

    public void removeColumn(int col){
        
        for(int i=entries.size()-1;i>=0;i--){
            ScantArrayEntry x=entries.get(i);
            if(x.getColumn()==col){
                entries.remove(i);

            }
            if(x.getColumn()>col){
                entries.remove(i);
                entries.add(new ScantArrayEntry(x.getRow(), (x.getColumn())-1,x.getValue()));

            }
        }
        numColumns--;
    }

    public String toString(){
        String s = "";
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numColumns; j++){
                s += getValueAt(i, j) + " ";
            }
            s += "\n";
        }
        return s;
    }
    
        
    

    public static void main(String[] args){
        ScantArray sa1 = new ScantArray(4,5);
        sa1.addEntry(1,4,4);
        sa1.addEntry(2,0,1);
        sa1.addEntry(3,1,-9);
        sa1.addEntry(1,1,5);

        System.out.println(sa1.getValueAt(2,0));
        System.out.println(sa1.getValueAt(3,1));
        System.out.println(sa1.getValueAt(2,3));
        System.out.println("rows "+ sa1.getNumRows());
        System.out.println("columns "+ sa1.getNumColumns());

        System.out.println(sa1);

        sa1.removeColumn(1);
        System.out.println(sa1);

        ScantArray sa2=new ScantArray(4, 5);
           
        sa2.addEntry(0,3,2);
        sa2.addEntry(2,4,6);
        sa2.addEntry(1,2,7);
        sa2.addEntry(3,0,1);
        sa2.addEntry(2,1,3);
            
        System.out.println(sa2.getValueAt(2,0));
        System.out.println(sa2.getValueAt(3,0));
        System.out.println(sa2.getValueAt(1,2));
        System.out.println("rows "+ sa2.getNumRows());
        System.out.println("columns "+ sa2.getNumColumns());

        System.out.println(sa2);

        sa2.removeColumn(3);
        System.out.println(sa2);
    }
}
