// 멀쩡한 사각형

public class P15 {
    class Solution {
        public long solution(int w, int h) {
            long x = w;
            long y = h;
            long ans = x * y;

            long gcd = gcd(x, y);

            x /= gcd;
            y /= gcd;

            ans = ans - gcd * (x + y - 1);

            return ans;
        }

        public long gcd(long x, long y) {
            long max = Math.max(x, y);
            long min = Math.min(x, y);

            while (min != 0) {
                long temp = max % min;
                max = min;
                min = temp;
            }
            return max;
        }
    }
}
