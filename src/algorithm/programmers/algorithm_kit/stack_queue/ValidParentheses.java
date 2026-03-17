package algorithm.programmers.algorithm_kit.stack_queue;

import java.util.*;

public class ValidParentheses {
	boolean solution(String s) {
        
        Deque<Character> dq = new ArrayDeque<>();
        
        for(char c : s.toCharArray()){
            if(c == '(') dq.push(c);
            else {
                if(!dq.isEmpty()) dq.pop();
                else return false;
            }
        }
    
        return dq.size() == 0 ? true : false;
        
    }
	
	public static void main(String[] args) {
		ValidParentheses T = new ValidParentheses();
		System.out.println(T.solution("()()"));
		System.out.println(T.solution("(())()"));
		System.out.println(T.solution(")()("));
		System.out.println(T.solution("(()("));
		
	}
}
