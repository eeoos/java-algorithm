import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] arr = br.readLine().trim().toCharArray();
    
    Stack<Character> s = new Stack<>();
    
    
   	for(char c : arr){
      if('(' == c){
        s.push(c);
      } else if(')' == c){
        s.pop();
      }
    }
    
    String result = "";
    result = s.size() != 0 ? "NO" : "YES";
    System.out.println(result);
    
  }
}