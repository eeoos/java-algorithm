import java.util.*;
import java.io.*;
  
public class Main {
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][n];
    for(int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j<n; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
	int cnt = 0;
    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    Deque<Integer> dq = new ArrayDeque<>();
    while(m-- >0){
      int tmp = Integer.parseInt(st.nextToken()) -1;
      for(int i = 0; i<n; i++){
        if(arr[i][tmp] != 0){
          int e = arr[i][tmp];
          arr[i][tmp] = 0;
          if(!dq.isEmpty() && dq.peek() == e){
            cnt+=2;
            dq.pop();
          }else dq.push(e);
          break;
        }
      }
    }
    
    System.out.println(cnt);
  }
}