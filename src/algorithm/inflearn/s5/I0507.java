package algorithm.inflearn.s5;

import java.io.*;

public class I0507 {
  public static void main(String[] args) throws IOException {
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    String s = br.readLine();
    char[] ia = br.readLine().toCharArray();
    
    for(int i = 0; i<ia.length; i++){
      if(s.indexOf(ia[i]) != -1) sb.append(ia[i]);
    }
    
    String result = "";
    
    result = sb.toString().startsWith(s) ? "YES" : "NO";
    System.out.println(result);
    
    
  }
}