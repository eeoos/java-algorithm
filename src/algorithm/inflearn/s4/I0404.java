package algorithm.inflearn.s4;

import java.util.*;
import java.io.*;
  
public class I0404 {
  public static void main(String[] args) throws IOException {
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] s = br.readLine().trim().toCharArray();
    
	char[] ca = br.readLine().trim().toCharArray();
    
    Arrays.sort(ca);
    int cnt = 0;
    for(int i = 0; i<=s.length-ca.length; i++){
      char[] tmp = new char[ca.length];
      for(int j = i; j<i+ca.length; j++){
        tmp[j%ca.length] = s[j];
      }
      
      Arrays.sort(tmp);
      boolean isA = false;
      for(int j = 0; j<ca.length; j++){
        if(tmp[j] != ca[j]) {
          isA = false;
          break;
        }
        isA = true;
      }
      
      if(isA) cnt++;
           
    }
    System.out.println(cnt);
  }
}