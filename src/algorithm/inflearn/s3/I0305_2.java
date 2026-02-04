package algorithm.inflearn.s3;

import java.io.*;

public class I0305_2 {
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(br.readLine());
    
    int lt = 1, sum=0, cnt=0;
   	for(int rt =1; rt<=T/2+1; rt++){
      sum += rt;
      if(sum == T) cnt++;
      while(sum >= T){
        sum-=lt++;
        if(sum == T) cnt++;
      }
    }
    System.out.println(cnt);
  }
}