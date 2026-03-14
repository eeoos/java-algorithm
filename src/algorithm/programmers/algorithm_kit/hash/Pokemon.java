package algorithm.programmers.algorithm_kit.hash;

import java.util.*;

public class Pokemon {
	public static void main(String[] args) {
		Pokemon T = new Pokemon();
		System.out.println(T.solution(new int[] {3,1,2,3}));
		System.out.println(T.solution(new int[] {3,3,3,2,2,4}));
		System.out.println(T.solution(new int[] {3,3,3,2,2,2}));
	}
	
	public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums) set.add(x);
        
        return set.size() > nums.length/2 ? nums.length/2 : set.size();
        
    }
}