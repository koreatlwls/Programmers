import java.util.Stack;

//크레인 인형뽑기 게임

public class P09 {
    class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < moves.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[j][moves[i] - 1] != 0) {
                        if (!stack.isEmpty() && stack.peek() == board[j][moves[i] - 1]) {
                            stack.pop();
                            answer += 2;
                        } else stack.push(board[j][moves[i] - 1]);
                        board[j][moves[i] - 1] = 0;
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
