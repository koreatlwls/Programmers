//없는 숫자 더하기

public class P12 {
    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;
            int[] cnt = new int[10];

            for(int num : numbers){
                cnt[num] ++;
            }

            for(int i=0;i<10;i++){
                if(cnt[i] ==0){
                    answer+=i;
                }
            }

            return answer;
        }
    }
}
