import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> prefixSum = new ArrayList<Long>();

        long cummulativeSum = 0;
        for (int i = 0; i < A.size(); i += 1) {

            cummulativeSum += Long.valueOf(A.get(i));
            prefixSum.add(cummulativeSum);

        }
        ArrayList<Long> sum = new ArrayList<Long>();
        for (int i = 0; i < B.size(); i += 1) {
            int left = B.get(i).get(0);
            int right = B.get(i).get(1);
            if (left == 0) {
                sum.add(Long.valueOf(prefixSum.get(right)));

            } else {
                sum.add(Long.valueOf(prefixSum.get(right) - prefixSum.get(left - 1)));
            }

        }
        return sum;
    }

}

public class Main {
    public static void main(String[] args) {
        // Solution s = new Solution();
        java.util.ArrayList<Integer> A = new java.util.ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>(Arrays
                .asList(new ArrayList<Integer>(Arrays.asList(0, 3)), new ArrayList<Integer>(Arrays.asList(1, 2))));
        Solution s = new Solution();
        ArrayList<Long> sum = s.rangeSum(A, B);
        System.out.println(sum);

    }

}