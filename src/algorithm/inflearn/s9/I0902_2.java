package algorithm.inflearn.s9;

import java.util.*;
import java.io.*;

public class I0902_2 {
  static class Meeting {
    int s, e;
    Meeting(int s, int e){this.s = s; this.e=e;}
    
  }
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    Meeting[] arr = new Meeting[n];
    for(int i =0;i<n; i++){
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      arr[i] = new Meeting(s, e);
    }
    
    Arrays.sort(arr, (m1, m2) -> {
    	if(m1.e == m2.e) return m1.s - m2.s;
    	return m1.e-m2.e;
    });
    
    int result = 0;
    int max = Integer.MIN_VALUE;
    
    for(Meeting m : arr){
      if(m.s >= max){
        result++;
        max = m.e;
      }
    }
    
    System.out.println(result);
  }
}
