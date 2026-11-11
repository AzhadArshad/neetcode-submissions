class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int n : nums){
            arr.add(n);
        }
        for(int n : nums){
            arr.add(n);
        }
        int [] arr2 = new int [arr.size()];
        for(int i=0;i<arr.size();i++){
            arr2[i] = arr.get(i);
        }
        return arr2;
    }
}