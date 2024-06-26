import java.util.ArrayList;
import java.util.List;

public class PascalTriagle {
    public static void main(String[] args) {
        PascalTriagle pt = new PascalTriagle();
        List<List<Integer>> pascal = pt.getPascal(4);
        for(List<Integer> pascline : pascal){
            System.out.println(pascline);
        }
    }

    List<List<Integer>> getPascal(int numRow){
        int n=0;
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> firstpasc = new ArrayList<>();
        firstpasc.add(1);
        pascal.add(firstpasc);
        for(int i=1;i<numRow-1;i++){
            List<Integer> prevPasc = pascal.get(i-1);
            List<Integer> curPasc = new ArrayList<>();
            curPasc.add(1);
            for(int j=1;j<i;j++){
                n = prevPasc.get(j) + prevPasc.get(j-1);
                curPasc.add(n);
            }
            curPasc.add(1);
            pascal.add(curPasc);
        }
        return pascal;
    
    }
}
