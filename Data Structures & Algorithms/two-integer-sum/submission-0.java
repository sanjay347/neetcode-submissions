class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> compare = new HashMap<>();

        for( int i = 0; i < nums.length; i++) {
            int compl = target - nums[i];
            if(compare.containsKey(compl)) {
                return new int[]{compare.get(compl) , i};
            } compare.put(nums[i], i);

        
    }
    return new int[]{};
    }
}
