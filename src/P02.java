
// 로또의 최고 순위와 최저 순위

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class P02 {

    static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            Map<Integer, Integer> win = new HashMap<>();
            for (int i = 0; i < win_nums.length; i++) {
                win.put(win_nums[i], i);
            }

            int noCnt = 0;
            int ansCnt = 0;
            for (int i = 0; i < lottos.length; i++) {
                if (lottos[i] == 0) {
                    noCnt++;
                } else {
                    if (win.containsKey(lottos[i])) {
                        ansCnt++;
                    }
                }
            }

            int maxCnt = ansCnt + noCnt;
            int minCnt = ansCnt;

            maxCnt = changeGrade(maxCnt);
            minCnt = changeGrade(minCnt);
            int[] result = {maxCnt, minCnt};
            return result;
        }

        static int changeGrade(int cnt) {
            switch (cnt) {
                case 6:
                    return 1;
                case 5:
                    return 2;
                case 4:
                    return 3;
                case 3:
                    return 4;
                case 2:
                    return 5;
                default:
                    return 6;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        int[] input1 = {44, 1, 0, 0, 31, 25};
        int[] input2 = {31, 10, 45, 1, 6, 9};

        int[] result = solution.solution(input1, input2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
