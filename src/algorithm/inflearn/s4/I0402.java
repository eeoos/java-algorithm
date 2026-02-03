package algorithm.inflearn.s4;

import java.io.*;
import java.util.*;

public class I0402 {
  public static void main(String[] args) throws IOException{
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] a1 = br.readLine().toUpperCase().toCharArray();
    char[] a2 = br.readLine().toUpperCase().toCharArray();
    
    Arrays.sort(a1);
    Arrays.sort(a2);
    for(int i = 0; i<a1.length; i++){
      if(a1[i] != a2[i]) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}