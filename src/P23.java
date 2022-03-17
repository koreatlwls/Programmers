import java.util.Arrays;

// 체육복

public class P23 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n + 2];
        Arrays.sort(lost);
        for (int r : reserve)
            arr[r]++;
        for (int l : lost) arr[l]--;
        for (int l : lost) {
            if (arr[l] < 0 && arr[l - 1] > 0) {
                arr[l - 1]--;
                arr[l]++;
            } else if (arr[l] < 0 && arr[l + 1] > 0) {
                arr[l + 1]--;
                arr[l]++;
            } else continue;
        }
        for (int i = 1; i <= n; i++) if (arr[i] >= 0) answer++;
        return answer;
    }
}
