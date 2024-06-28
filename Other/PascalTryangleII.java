import java.util.ArrayList;
import java.util.List;

public class PascalTryangleII {
    public static void main(String[] args){
        List<Integer> pasc = getrowPascal(33);
        for(Integer i : pasc){
            System.out.print(i + "\t");
        }

    }

    static List<Integer> getrowPascal(int index){
        List<List<Integer>> Pascal = new ArrayList<List<Integer>>();
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        Pascal.add(firstrow);
        List<Integer> prevPascal = Pascal.get(0);
        for(int i=1;i<=index;i++){
            List<Integer> curPascal = new ArrayList<Integer>();
            curPascal.add(1);
            for(int j=1;j<i;j++){
                curPascal.add(prevPascal.get(j) + prevPascal.get(j-1));
            }
            curPascal.add(1);
            Pascal.add(curPascal);
            prevPascal = curPascal;

        }
        return Pascal.get(index);
    } 
    
}
