import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// 오픈채팅방

public class P05 {

    static class Solution {
        public String[] solution(String[] record) {
            Map<String, String> map = new HashMap<>();

            int totLen = 0;
            for(String input: record){
                String[] tmp = input.split(" ");
                if(tmp[0].equals("Enter")){
                    map.put(tmp[1],tmp[2]);
                    totLen++;
                }else if(tmp[0].equals("Change")){
                    map.put(tmp[1], tmp[2]);
                }else{
                    totLen++;
                }
            }

            String[] answer = new String[totLen];
            int idx = 0;
            for(String input: record){
                String[] tmp = input.split(" ");
                if(tmp[0].equals("Enter")){
                    answer[idx++] = map.get(tmp[1]) + "님이 들어왔습니다.";
                }else if(tmp[0].equals("Leave")){
                    answer[idx++] = map.get(tmp[1]) + "님이 나갔습니다.";
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        String[] input = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] result = solution.solution(input);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
