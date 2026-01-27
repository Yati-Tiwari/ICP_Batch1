package week_3;

import java.util.Scanner;

public class Time_Needed_to_Buy_Tickets_Solved_Easy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // number of people
        int n = sc.nextInt();

        // tickets array input
        int[] tickets = new int[n];
        for (int i = 0; i < n; i++) {
            tickets[i] = sc.nextInt();
        }

        // index k
        int k = sc.nextInt();

        // direct call, object nahi banaya
        int ans = timeRequiredToBuy(tickets, k);

        // output
        System.out.println(ans);
    }

    // static method bana diya
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int t = 0; // total time

        for (int i = 0; i < n; i++) {

            // agar index i <= k hai
            // to wo max tickets[k] tak hi buy karega
            if (i <= k) {
                t += Math.min(tickets[i], tickets[k]);
            }
            // agar index i > k hai
            // to last round me k ke baad wale nahi aayenge
            else {
                t += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return t;
    }
}
