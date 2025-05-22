class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        
        for (int num = low; num <= high; num++) {
            if (isSymmetricMath(num)) {
                count++;
            }
        }
        
        return count;
    }
    
    private boolean isSymmetricMath(int num) {
        int original = num;
        int digitCount = 0;
        int temp = num;
        
        // 자릿수 계산
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }
        
        if (digitCount % 2 != 0) return false;
        
        int leftSum = 0, rightSum = 0;
        int mid = digitCount / 2;
        int divisor = 1;
        
        // 뒤쪽 절반의 합 계산
        for (int i = 0; i < mid; i++) {
            rightSum += num % 10;
            num /= 10;
        }
        
        // 앞쪽 절반의 합 계산
        for (int i = 0; i < mid; i++) {
            leftSum += num % 10;
            num /= 10;
        }
        
        return leftSum == rightSum;
    }
}