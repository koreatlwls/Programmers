public class P26 {
    public long solution(int n, int[] times) {
        long min = 0;
        long max = 1000000000L * n;

        while (min < max) {
            long mid = (min + max) / 2;

            long count = 0;
            for (int time : times) {
                long cap = mid / time;
                count += cap;
            }

            if (count >= n) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        return min;
    }
}
