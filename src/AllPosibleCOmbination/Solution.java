package AllPosibleCOmbination;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new LinkedList<>();

        combination(1,n,k ,results,new LinkedList<Integer>());


        return results;

    }

    public static void combination(int start,int n,int k,List<List<Integer>> result,List<Integer> path){
        if(k == 0){
            result.add(new LinkedList<>(path));
            return;
        }


        // path.add(start);
        // combination(start+1,n,k-1,result,path);
        for (int i = start; i <= n; i++) {
            path.add(i);
            combination(i + 1, n, k - 1, result, path);
            path.remove(path.size() - 1); // Backtrack
        }

    }
}
