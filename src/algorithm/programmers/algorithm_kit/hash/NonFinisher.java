package algorithm.programmers.algorithm_kit.hash;
import java.util.*;

public class NonFinisher {
	public static void main(String[] args) {
		NonFinisher T = new NonFinisher();
		
		System.out.println(T.solution(new String[]{"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
		System.out.println(T.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}));
		System.out.println(T.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
	}
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        for(String s: participant){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        
        for(String s : completion){
            map.put(s, map.get(s)-1);
        }
        
        for(Map.Entry<String, Integer> m : map.entrySet()){
            if(m.getValue() != 0) {
                answer = m.getKey();
                break;
            }
        }
        return answer;
    }
}
