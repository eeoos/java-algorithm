import java.util.*;
import java.io.*;
  
public class Solution {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 	StringTokenizer st = new StringTokenizer(br.readLine());
    
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];
   	int cnt = 0;
	List<Integer> iarr = new ArrayList<>();
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<N; i++){
 	  arr[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i = 0; i<=N-K; i++){
      int sum = 0;
      for(int j = 0; j<3; j++){
        sum += arr[i+j];
      }
      iarr.add(sum);
    }
    Collections.sort(iarr, Collections.reverseOrder());
    System.out.println(iarr);
    int tmp = 0;
    for(int i = 0; i<iarr.size(); i++){
      if(iarr.get(i) != tmp){
        tmp = iarr.get(i);
        cnt++;
        if(cnt == K){
          System.out.println(tmp);
          return;
        }
      }
    }
    System.out.println(-1);
  }
}