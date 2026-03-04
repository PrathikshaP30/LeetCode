class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        helper(nums,cur);
        return res;
    }

    private void helper(int[] nums,List<Integer> cur ){
        if (cur.size() == (nums.length)){
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int num: nums){
            if(!cur.contains(num)){
                cur.add(num);
                helper(nums,cur);
                cur.remove(cur.size()-1);
            }
        }


    }
}