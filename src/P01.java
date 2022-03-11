import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 신고 결과 받기

public class P01 {

    static class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] ret = new int[id_list.length];
            Map<String, Integer> index = new HashMap<>();
            Map<String, List<Integer>> list = new HashMap<>();

            for(int i=0;i<id_list.length;i++){
                index.put(id_list[i], i);
            }

            for(String rep : report){
                String[] ids = rep.split(" ");
                String fromId = ids[0];
                String toId = ids[1];

                if(!list.containsKey(toId))list.put(toId,new ArrayList<>());
                List<Integer> tmp = list.get(toId);
                if(!tmp.contains(index.get(fromId)))tmp.add(index.get(fromId));
            }

            for(int i=0;i<id_list.length;i++){
                String id = id_list[i];
                if(list.containsKey(id) && list.get(id).size()>=k){
                    for(int idx : list.get(id)){
                        ret[idx]++;
                    }
                }
            }

            return ret;
        }
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();

        String[] input1 = {"muzi", "frodo", "apeach", "neo"};
        String[] input2 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        int[] result = solution.solution(input1,input2,k);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
