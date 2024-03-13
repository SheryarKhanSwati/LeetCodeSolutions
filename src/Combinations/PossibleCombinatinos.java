package Combinations;

import java.util.LinkedList;
import java.util.List;

public class PossibleCombinatinos {
    public static List<List<Integer>> combinations(int[] n){
        List<List<Integer>> results = new LinkedList<>();

        combinations(n,0,results,new LinkedList<Integer>());


        return results;
    }

    public static void combinations(int[] n, int i , List<List<Integer>> result,List<Integer> path){

        if(i == n.length){
            result.add(path);
            return;
        }

        List<Integer> pathWithCurrent = new LinkedList<>(path);
        pathWithCurrent.add(n[i]);

        combinations(n, i+1,result,path);
        combinations(n, i+1,result,pathWithCurrent);

    }


}
