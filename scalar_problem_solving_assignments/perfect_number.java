public class Solution {
    public int solve(int A) {
        int sum = 1;
        for (int i = 2; i * i <= A; i++) {
            if (A % i == 0) {
                if (i * i != A) {
                    sum = sum + i + A / i;
                }

                else {
                    sum += i;
                }
            }

        }
        if (sum == A && A != 1) {
            return 1;
        }
        System.out.println(sum);
        return 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solve(6));
    }
}
