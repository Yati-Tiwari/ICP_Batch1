// package ICPweek_1;

public class Problem4 {
    public static void main(String[] args) {

        int n = 10; // count primes less than n
        int result = countPrimes(n);

        System.out.println(result); // Expected output: 4 (primes: 2,3,5,7)
    }

    // Wrapper function to handle small inputs
    public static int countPrimes(int n) {
        // If n <= 2, no primes less than n
        if (n <= 2) {
            return 0;
        }
        // Otherwise call sieve
        return PrimeSieve(n);
    }

    // Sieve of Eratosthenes Algorithm
    public static int PrimeSieve(int n) {

        // boolean array to mark prime status
        // true → prime, false → not prime
        boolean[] ans = new boolean[n];

        // Assume all numbers >= 2 are prime initially
        for (int i = 2; i < n; i++) {
            ans[i] = true;
        }

        // 0 and 1 are not primes
        ans[0] = ans[1] = false;

        // Main sieve process
        // We iterate till √n (i*i <= n)
        for (int i = 2; i * i <= ans.length; i++) {

            // If ans[i] is still true → it is prime
            if (ans[i]) {

                // Mark multiples of i as non-prime
                for (int j = 2; i * j < ans.length; j++) {
                    ans[i * j] = false;
                }
            }
        }

        // Count how many values are still marked prime
        int c = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i]) c++;
        }

        return c;
    }
}
