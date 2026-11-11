class Solution {
    public boolean hasDuplicate(int[] nums) {
    HashSet<Integer> seen = new HashSet<>();
    for (int n : nums) {
        if (!seen.add(n)) {
            return true; // exits the function IMMEDIATELY when duplicate found
        }
    }
    return false;
}
}
