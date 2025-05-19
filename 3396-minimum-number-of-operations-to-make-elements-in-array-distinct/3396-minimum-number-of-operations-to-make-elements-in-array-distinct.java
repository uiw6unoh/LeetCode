import java.util.*;

class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Set<Integer> numsSet = new HashSet<>();
        
        for (int i = n - 1; i >= 0; i--) {
            if (numsSet.contains(nums[i])) {
                return i / 3 + 1;
            }
            numsSet.add(nums[i]);
        }
        
        return 0;
    }
}