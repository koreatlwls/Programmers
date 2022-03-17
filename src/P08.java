import java.io.IOException;

//키패드 누르기

public class P08 {

    static class Solution {
        public String solution(int[] numbers, String hand) {
            String answer = "";
            int[] left = {3, 0};
            int[] right = {3, 2};

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 0) numbers[i] = 11;
                if (numbers[i] % 3 == 1) {
                    answer += "L";
                    left = setCoordinate(numbers[i]);
                } else if (numbers[i] % 3 == 0) {
                    answer += "R";
                    right = setCoordinate(numbers[i]);
                } else {
                    int leftDist = Math.abs(left[0] - (numbers[i] - 1) / 3) + Math.abs(left[1] - (numbers[i] - 1) % 3);
                    int rightDist = Math.abs(right[0] - (numbers[i] - 1) / 3) + Math.abs(right[1] - (numbers[i] - 1) % 3);
                    if (leftDist == rightDist) {
                        if (hand.equals("left")) {
                            answer += "L";
                            left = setCoordinate(numbers[i]);
                        } else {
                            answer += "R";
                            right = setCoordinate(numbers[i]);
                        }
                    } else {
                        if (leftDist < rightDist) {
                            answer += "L";
                            left = setCoordinate(numbers[i]);
                        } else {
                            answer += "R";
                            right = setCoordinate(numbers[i]);
                        }
                    }
                }
            }

            return answer;
        }

        static int[] setCoordinate(int num) {
            int[] coordinate = new int[2];
            coordinate[0] = (num - 1) / 3;
            coordinate[1] = (num - 1) % 3;
            return coordinate;
        }
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        int[] input = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        System.out.print(solution.solution(input, "right"));

    }
}
