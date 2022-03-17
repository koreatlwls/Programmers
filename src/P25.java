// 타겟넘버

public class P25 {

    static int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }

    static void dfs(int[] numbers, int target, int cnt, int sum) {
        if (cnt == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        dfs(numbers, target, cnt + 1, sum + numbers[cnt]);
        dfs(numbers, target, cnt + 1, sum - numbers[cnt]);
    }
}
