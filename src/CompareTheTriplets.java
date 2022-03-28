import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
     public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
         int contA = 0, contB = 0;
         for (int i = 0; i < a.size(); i++) {
             if (a.get(i) <b.get(i)){
                 contA++;
             }else if(b.get(i)>a.get(i)){
                 contB++;
             }else{

             }
         }
         ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(contA,contB));
         return lista;
     }
}
