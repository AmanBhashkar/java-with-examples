import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int k = B % A.size();
        int i, j;
        // reverse the last k numbers
        for (i = A.size() - k, j = A.size() - 1; i < j; i++, j--) {
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);

        }
        // reverse the first n-k numbers;
        for (i = 0, j = A.size() - k - 1; i < j; i++, j--) {
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
        }
        // reverse the entire array;
        for (i = 0, j = A.size() - 1; i < j; i++, j--) {
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
        }
        return A;
    }

    public static void main(String[] args) {
        // Solution s = new Solution();
        ArrayList<Integer> A = new java.util.ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        int B = 2;

        Solution s = new Solution();
        ArrayList<Integer> result = s.solve(A, B);
        System.out.println(result);

    }
}