import java.util.HashSet;

// 폰켓몬

public class P28 {
    public int solution(int[] nums) {
        int max = nums.length / 2;

        HashSet<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        if(numSet.size() > max){
            return max;
        }else{
            return numSet.size();
        }
    }
}
