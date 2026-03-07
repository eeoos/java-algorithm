package algorithm.inflearn.s9;

import java.util.*;
import java.io.*;
  
public class I0903 {
  static class Time {
    public int t;
    public char s;
    Time(int t, char s) {
      this.t = t;
      this.s = s;
    }
  }
  static char[] c = {'s' ,'e'};
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    List<Time> list = new ArrayList<>();
    for(int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j<2; j++){
        int t= Integer.parseInt(st.nextToken());
        list.add(new Time(t, c[j]));
      }
    }
    
    list.sort((t1, t2) -> {
      if(t1.t == t2.t) return t1.s - t2.s;
      return t1.t - t2.t;
    });
    
    int cnt= 0;
    int result = 0;
    for(Time t : list){
      if(t.s == 's') {
        cnt++;
        result = Math.max(result, cnt);
      }else {
        cnt--;
      }
    }
    
    System.out.println(result);
  }
}