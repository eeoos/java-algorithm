package algorithm.inflearn.introduction.s1.repeat;

import java.io.*;

public class I0104_2 {
  public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    
    for(int i = 0; i<n; i++){
      sb.setLength(0);
      System.out.println(sb.append(br.readLine()).reverse());
    }
  }
}