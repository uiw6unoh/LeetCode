    class Solution {
        int sum; 
        int size; 
        int[] nums;

        public int subsetXORSum(int[] nums) {
            this.sum = 0;
            this.size = nums.length;
            this.nums = nums;

            subset(0, new LinkedList<>());

            return this.sum;
        }

        public void subset(int idx, List<Integer> arr) {
            this.sum += arr.stream().reduce(0, (a, b) -> a ^ b);

            if (idx >= this.size) {
                return;
            }

            for (int i = idx; i < this.size; i++) {
                arr.add(this.nums[i]); 
                subset(i + 1, arr); 
                arr.remove(arr.size() - 1);
            }
        }
    }