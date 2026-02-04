package algorithm.inflearn.s5;

import java.util.*;
import java.io.*;
  
public class I0503 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    int cnt = 0;
    
    int T = Integer.parseInt(br.readLine());
    int[][] arr = new int[T][T];
    for(int i = 0; i<T; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j<T; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    Deque<Integer> dq = new ArrayDeque<>();
    
    int S = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    while(S-- > 0){
      int tmp = Integer.parseInt(st.nextToken()) - 1;
   	  for(int i = 0; i<T; i++){
        int e = arr[i][tmp];
        if(e != 0){
          if(dq.isEmpty()){
          	dq.push(e);
          }else {
           	if(dq.peek() == e){
              dq.pop();
              cnt+=2;
            }else {
              dq.push(e);
            }
          }
          arr[i][tmp] = 0;
          break;
        }
      }
    }
	System.out.println(cnt);
  }
}