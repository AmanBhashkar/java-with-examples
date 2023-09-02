import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<Integer> evenPrefixSum = new ArrayList<Integer>();
        evenPrefixSum.add(A.get(0));
        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) {
                evenPrefixSum.add(i, evenPrefixSum.get(i - 1) + A.get(i));
            } else {
                evenPrefixSum.add(i, evenPrefixSum.get(i - 1));
            }
        }

        ArrayList<Integer> oddPrefixSum = new ArrayList<Integer>();
        oddPrefixSum.add(0);
        for (int i = 1; i < N; i++) {
            if (i % 2 == 1) {
                oddPrefixSum.add(i, oddPrefixSum.get(i - 1) + A.get(i));
            } else {
                oddPrefixSum.add(i, oddPrefixSum.get(i - 1));
            }
        }

        int sEven = 0;
        int sOdd = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                sEven = oddPrefixSum.get(N - 1) - oddPrefixSum.get(i);
                sOdd = evenPrefixSum.get(N - 1) - evenPrefixSum.get(i);
            } else {
                sEven = evenPrefixSum.get(i - 1) + oddPrefixSum.get(N - 1) - oddPrefixSum.get(i);
                sOdd = oddPrefixSum.get(i - 1) + evenPrefixSum.get(N - 1) - evenPrefixSum.get(i);
            }

            if (sEven == sOdd) {
                count += 1;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        // Solution s = new Solution();
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 1, 1));

        Solution s = new Solution();
        int result = s.solve(A);
        System.out.println(result);

    }
}