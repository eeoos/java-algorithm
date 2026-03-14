package algorithm.inflearn.introduction.s1.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I0111 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    char[] arr = br.readLine().toCharArray();
    
    int cnt= 0;
    char pre = arr[0];
    for(char c : arr){
      if(pre == c) {
        cnt++;
      }else {
        sb.append(pre);
        if(cnt > 1) sb.append(cnt);
        pre = c;
        cnt = 1;
      }
    }
    sb.append(pre);
    if(cnt > 1) sb.append(cnt);
    System.out.println(sb);
  }
}
