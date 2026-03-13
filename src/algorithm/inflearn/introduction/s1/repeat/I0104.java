package algorithm.inflearn.introduction.s1.repeat;

import java.io.*;

public class I0104 {
  public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    for(int i = 0; i<n; i++){
      char[] arr = br.readLine().toCharArray();
      int lt = 0;
      int rt = arr.length-1;
      
      while(lt<rt){  
        char tmp = arr[lt];
        arr[lt] = arr[rt];
        arr[rt]= tmp;        
        lt++;
      	rt--;
      }
      
      System.out.println(String.valueOf(arr));
    }
  }
}