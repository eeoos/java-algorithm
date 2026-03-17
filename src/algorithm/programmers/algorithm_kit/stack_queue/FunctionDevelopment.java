package algorithm.programmers.algorithm_kit.stack_queue;

import java.util.*;

public class FunctionDevelopment {
	public static void main(String[] args) {
		FunctionDevelopment T = new FunctionDevelopment();
		System.out.println(Arrays.toString(T.solution(new int[] {93, 30, 55}, new int[]{1, 30, 5})));
		System.out.println(Arrays.toString(T.solution(new int[] {95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
	}
	public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        
        int cur = (100 - progresses[0] + speeds[0] -1) / speeds[0];
        int cnt = 1;
        
        for(int i = 1; i<speeds.length; i++){
            int rem = (100 - progresses[i] + speeds[i] -1) / speeds[i];
            if(cur >= rem)  cnt++;
            else {
                answer.add(cnt);
                cnt = 1;
                cur = rem;
            }
        }
        
        answer.add(cnt);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
	
}
