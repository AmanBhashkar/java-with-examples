import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> subArrayList = new ArrayList<>();

        for (int start = 0; start < A.size(); start++) {
            for (int end = start; end < A.size(); end++) {

                ArrayList<Integer> arr = new ArrayList<>();

                for (int i = start; i <= end; i++) {
                    arr.add(A.get(i));
                }
                subArrayList.add(arr);
            }
        }

        return subArrayList;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ArrayList<Integer> A = new java.util.ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        System.out.println(s.solve(A));
    }

}
