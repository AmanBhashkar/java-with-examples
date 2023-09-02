public class Solution {
    public int solve(int A) {
        int cnt = 0;
        for (int i = 2; i <= A; i += 1) {
            boolean prime = false;
            int factor = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prime = true;
                    break;
                }
            }
            if (!prime) {
                cnt += 1;
            }
            // System.out.println(i + " " + factor);
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solve(10));
    }
}