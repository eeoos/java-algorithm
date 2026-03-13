package algorithm.inflearn.introduction.s1.repeat;

import java.io.*;

public class I0105_2 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] arr = br.readLine().toCharArray();
    
    int lt =0, rt = arr.length-1;
    
    while(lt<rt){
      if(!Character.isAlphabetic(arr[lt])) lt++;
	  else if(!Character.isAlphabetic(arr[rt])) rt--;
      else {
        char tmp = arr[lt];
        arr[lt] = arr[rt];
        arr[rt] = tmp;
        rt--;
        lt++;
      }
    }
    
    System.out.println(String.valueOf(arr));
  }
}