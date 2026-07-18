public class BruteForce {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        System.out.println(maxProfit);
    }
}
