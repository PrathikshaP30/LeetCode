class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> numMap = new HashMap<>();

        for(int num : nums){
            if (numMap.containsKey(num)){
                return true;
            }
            else numMap.put(num,1);
        }
        return false;
    }
}