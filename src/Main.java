import java.util.*;
import java.io.*;
  
public class Main {
  public static void main(String[] args) throws IOException {
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    char[] arr = br.readLine().toCharArray();
    Deque<Character> dq = new ArrayDeque<>();
    for(char c : arr){
      if(c == ')') while(dq.pop() != '(');
      else dq.push(c);
    }
    
    int size = dq.size();
    for(int i =0; i<size; i++) {
    	sb.append(dq.pollLast());
    }
    
    System.out.println(sb);
  }
}