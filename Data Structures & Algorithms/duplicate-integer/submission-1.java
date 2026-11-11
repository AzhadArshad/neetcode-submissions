class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> x = new HashSet<>();
        for(int n:nums){
            x.add(n);
        }
        if(nums.length==x.size()){
            return false;
        }
        else{
            return true;
        }
 
    }
}
