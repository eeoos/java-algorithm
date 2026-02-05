import java.util.*;
import java.io.*;
  
public class Main {
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    char[] c1 = br.readLine().trim().toCharArray();
    char[] c2 = br.readLine().trim().toCharArray();
    Map<Character, Integer> m1 = new HashMap<>();
    Map<Character, Integer> m2 = new HashMap<>();
    
    for(int i = 0; i<c2.length; i++){
      m2.put(c2[i], m2.getOrDefault(c2[i], 0)+1);
    }
    
    for(int i = 0; i<c2.length-1; i++){
      m1.put(c1[i], m1.getOrDefault(c1[i], 0)+1);
    }
    
    int lt = 0, cnt=0;
    for(int rt = c2.length-1; rt<c1.length; rt++){
      m1.put(c1[rt], m1.getOrDefault(c1[rt], 0) + 1);
      if(m1.equals(m2)) cnt++;
      if(m1.get(c1[lt])>1) m1.put(c1[lt], m1.get(c1[lt])-1);
      else m1.remove(c1[lt]);
      
      lt++;
    }
    System.out.println(cnt);
  }
}