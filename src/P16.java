// 소수 만들기

public class P16 {

    static int answer = 0;

    public int solution(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k]))
                        answer++;
                }
            }
        }

        return answer;
    }

    static boolean isPrime(int num) {
        int i = 2;

        while (i * i <= num) {
            if (num % i++ == 0) return false;
        }

        return true;
    }
}
