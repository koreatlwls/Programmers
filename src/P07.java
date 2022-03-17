import java.io.IOException;

//숫자 문자열과 영단어

public class P07 {

    static class Solution {
        public int solution(String s) {
            String[] numSet = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            for (int i = 0; i < numSet.length; i++) {
                s = s.replace(numSet[i], Integer.toString(i));
            }
            return Integer.parseInt(s);
        }
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        System.out.print(solution.solution("one4seveneight"));
    }
}
