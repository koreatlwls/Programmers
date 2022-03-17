// N으로 표현

public class P24 {
    private static int N;
    private static int number;
    private static int answer = 9;

    static private void dfs(int count, int prev) {
        if (count > 8) {
            answer = -1;
            return;
        }
        if (number == prev && answer > count) {
            answer = count;
            return;
        }
        int n2 = N;
        for (int i = 0; i < 8 - count; i++) {
            dfs(count + i + 1, prev + n2);
            dfs(count + i + 1, prev - n2);
            dfs(count + i + 1, prev * n2);
            dfs(count + i + 1, prev / n2);
            n2 += N * (Math.pow(10, i + 1));
        }
    }

    public int solution(int N, int number) {
        P24.N = N;
        P24.number = number;
        dfs(0, 0);
        if (answer == 9) answer = -1;
        return answer;
    }
}
