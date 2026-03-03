class Solution {
    List<List<Integer>> res;
     
    public List<List<Integer>> subsets(int[] nums) {
        res  = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        helper(nums, 0 , cur);
        return res;
    }

    private void helper(int[] nums, int i , List<Integer> cur){
        if (i >= nums.length){ 
            res.add(new ArrayList<>(cur));
            return;
        }

        cur.add(nums[i]);
        helper(nums, i+1 , cur);
        cur.remove(cur.size()-1);
        helper(nums, i+1, cur);

    }
}