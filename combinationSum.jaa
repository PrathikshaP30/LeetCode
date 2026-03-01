class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates, target, 0, new ArrayList<>(), 0, res);
        return res;
    }

    private void dfs(int[] nums, int target, int i, List<Integer> cur, int total, List<List<Integer>> res) {
        if (total == target) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (i >= nums.length || total > target) {
            return;
        }

        cur.add(nums[i]);
        dfs(nums, target, i, cur, total + nums[i], res);
        cur.remove(cur.size() - 1);
        dfs(nums, target, i + 1, cur, total, res);
    }
}