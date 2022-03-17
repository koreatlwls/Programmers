import java.io.IOException;

// 124 나라의 숫자

public class P17 {

    static class Solution {
        public String solution(int n) {
            String answer = "";
            String[] numbers = {"4","1","2"};

            int num = n;
            while(num>0){
              int remainder = num %3;
              num/= 3;

              if(remainder == 0) num--;

              answer = numbers[remainder] + answer;
            }

            return answer;
        }
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        System.out.print(solution.solution(3));
    }
}
