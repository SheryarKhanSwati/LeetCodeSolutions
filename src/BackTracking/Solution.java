package BackTracking;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void backtrack(int[] n, List<List<Integer>> result, List<Integer> path){
        if(n.length == path.size()){
            result.add(new ArrayList<>(path));
        }

        for(int i = 0 ; i < n.length;i++){
            if(path.contains(n[i])) continue;

            path.add(n[i]);
            backtrack(n,result,path);
            //to backtrack
            path.remove(path.size()-1);
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, result,new ArrayList<>());


        return result;

    }
}
