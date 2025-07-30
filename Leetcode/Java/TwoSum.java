class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap= new HashMap<>();
        for(int index=0;index<nums.length;index++){
            int r = target-nums[index];
            if(hashMap.containsKey(r))
                return new int[]{hashMap.get(r), index};
            hashMap.put(nums[index],index);
        }
        return new int[]{};
    }
}