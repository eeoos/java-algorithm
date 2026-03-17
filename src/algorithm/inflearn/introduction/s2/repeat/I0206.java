package algorithm.inflearn.introduction.s2.repeat;

import java.util.*;
import java.io.*;
  
public class I0206 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
	List<Integer> list = new ArrayList<>();
    
    for(int i = 0; i<n; i++){
      int tmp = Integer.parseInt(st.nextToken());
      int rvs = 0;
      while(tmp > 0){
        rvs = (rvs * 10) + tmp % 10;
        tmp/=10;
      }
      if(rvs == 1) continue;
      boolean flag = true;
      
      for(int j = 2; j<rvs; j++){
        if(rvs % j == 0){
          flag = false;
          break;
        }
      }
      if(flag) list.add(rvs);
    }
    
    for(int i = 0; i<list.size(); i++){
      if(i>0) sb.append(" ");
      sb.append(list.get(i));
    }
    
    System.out.println(sb);
  }
}
