import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

// [1차] 추석 트래픽

public class P06 {

    static class Solution {
        public int solution(String[] lines) throws Exception {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss.SSS");

            int[] counts = new int[lines.length];
            int max = 0;

            for(int i=0; i<lines.length; i++) {
                String[] pre = lines[i].split(" ");
                Date preEndDate = format.parse(pre[1]);
                long preEnd = preEndDate.getTime();

                for (int j = i ; j < lines.length; j++) {
                    String[] next = lines[j].split(" ");
                    Date nextEndDate = format.parse(next[1]);
                    double sec = Double.parseDouble(next[2].substring(0, next[2].length()-1)); // 처리 시간

                    long nextStart = (long) (nextEndDate.getTime() - sec*1000 + 1);

                    if(preEnd + 1000 > nextStart) {
                        counts[i] += 1;
                        max = Math.max(max, counts[i]);
                    }
                }
            }
            return max;
        }
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        String[] input = {"2016-09-15 01:00:04.001 2.0s",
                "2016-09-15 01:00:07.000 2s"};
        System.out.print(solution.solution(input));
    }
}
