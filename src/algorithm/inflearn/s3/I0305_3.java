package algorithm.inflearn.s3;

import java.io.*;

public class I0305_3 {
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    
    int cnt = 1, result = 0; 
    T--;
    while(T>0){
      T -= ++cnt;
      if(T%cnt == 0) {
    	  System.out.println(T + " " + cnt);
    	  result++;
      }
    }
    System.out.println(result);
  }
}