class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = -1;
        

        for(int i : piles){
            if(r<i){
                r = i;
            }
        }
        int res = r;
        
         while (l <= r) {
            int k = l + (r - l) / 2; // ✅ overflow-safe mid
            long hours = 0;

            for (int p : piles) {
                // ✅ use ceiling division: (p + k - 1) / k
                hours += (p + k - 1) / k;
            }

            if (hours <= h) {
                res = k;   // valid speed, try smaller
                r = k - 1;
            } else {
                l = k + 1; // too slow, need faster speed
            }
        }

        return res;
    }
}
