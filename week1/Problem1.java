// package ICP_2026.week_1;

// import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    // buy and sell stock to maximize profit
     public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i:prices){
            min=Math.min(min,i);
            max=Math.max(max,i-min);
        }
        return max;
    }
}