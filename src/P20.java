import java.io.IOException;
import java.util.PriorityQueue;

// 더 맵게

public class P20 {

    static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int input : scoville) {
            pq.offer(input);
        }

        while (pq.peek() <= K) {
            if (pq.size() == 1) {
                return -1;
            }

            int a = pq.poll();
            int b = pq.poll();

            int result = a + (b * 2);

            pq.offer(result);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        int[] input = {1, 2, 3, 9, 10, 12};
        int k = 7;

        System.out.print(solution(input, k));
    }
}
