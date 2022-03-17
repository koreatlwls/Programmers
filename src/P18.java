import java.io.IOException;
import java.util.HashMap;

//완주하지 못한 선수

public class P18 {

    static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for(String player : participant) map.put(player, map.getOrDefault(player,0)+1);
        for(String player : completion) map.put(player, map.get(player)-1);
        for(String key : map.keySet()){
            if(map.get(key) !=0){
                answer = key;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        String[] input1 = {"leo", "kiki", "eden"};
        String[] input2 = {"eden", "kiki"};
        System.out.print(solution(input1, input2));
    }
}
