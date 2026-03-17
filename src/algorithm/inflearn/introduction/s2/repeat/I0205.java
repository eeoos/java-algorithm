package algorithm.inflearn.introduction.s2.repeat;

import java.io.*;

public class I0205 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int cnt = 0;
    int[] arr = new int[n+1];
    for(int i = 2; i<=n; i++){
      if(arr[i] == 0) cnt++;
      for(int j = i; j<=n; j+=i) arr[j]++;
    }
    
    System.out.println(cnt);
  }
}
