class Solution {
    public int maxCoins(int[] piles) {
          Arrays.sort(piles); // Sort the piles in ascending order
        int n = piles.length / 3; // Number of rounds

        int maxCoins = 0;
        int j = piles.length - 2; // Start from the second largest pile

        for (int i = 0; i < n; i++) {
            maxCoins += piles[j]; // Take the second largest pile in each round
            j -= 2; // Move to the next second largest pile for the next round
        }

        return maxCoins;
    }
}
