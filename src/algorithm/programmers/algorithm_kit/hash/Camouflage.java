package algorithm.programmers.algorithm_kit.hash;
import java.util.*;

public class Camouflage {
	public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>(); 
        for(String[] cloth : clothes){
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }
        
        int mul = 1;
        for(Map.Entry<String, Integer> e : map.entrySet()){
            mul *= e.getValue() + 1;
        }
        
        return mul - 1;
    }
	
	public static void main(String[] args) {
		Camouflage T = new Camouflage();
		System.out.println(T.solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
		System.out.println(T.solution(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
	}
}
