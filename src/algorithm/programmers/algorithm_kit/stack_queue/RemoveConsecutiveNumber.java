package algorithm.programmers.algorithm_kit.stack_queue;

import java.util.*;

public class RemoveConsecutiveNumber {
	public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        
        int pre = arr[0];
        answer.add(pre);
        for(int i= 1; i<arr.length; i++){
            if(pre != arr[i]) {
                answer.add(arr[i]);
            }
            pre = arr[i];
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
	
	
	
	public static void main(String[] args) {
		RemoveConsecutiveNumber T = new RemoveConsecutiveNumber();
		System.out.println(Arrays.toString(T.solution(new int[] {1,1,3,3,0,1,1})));
		System.out.println(Arrays.toString(T.solution(new int[] {4,4,4,3,3})));
	}
}
