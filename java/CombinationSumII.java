class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> cur = new ArrayList<>();
        res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,cur,0,0);
        return res;
        
    }

    public void helper(int[] cand, int target,List<Integer> cur, int total, int i){
        if(total == target){
            res.add(new ArrayList<>(cur));
            return ;
        }

        if (i >= cand.length|| total > target){
            return;
        }

        for(int j = i; j <cand.length; j++){
            if(j >i && cand[j] == cand[j-1]) continue;
            cur.add(cand[j]);
            helper(cand,target,cur,total+cand[j],j+1);
            cur.remove(cur.size()-1);
        }

    }
}