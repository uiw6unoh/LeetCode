import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<int[]> disc = new Stack<>();

        disc.push(new int[]{0, prices[0]});
        for (int cur = 1; cur < prices.length; cur++) {
            while (!disc.isEmpty() && disc.peek()[1] >= prices[cur]) {
                int[] check = disc.pop();
                prices[check[0]] -= prices[cur];
            }
            disc.push(new int[]{cur, prices[cur]});
        }
        return prices;
    }
}