package algorithm.inflearn.s4;

import java.io.*;
  
public class I0401 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int T = Integer.parseInt(br.readLine());
    char[] arr = br.readLine().toCharArray();
    
    char[] result = new char[5];
    for(char c : arr){
      result[c - 'A']++;
    }
    
    int max = Integer.MIN_VALUE;
    int index = 0;
    for(int i =0; i<result.length; i++){
      if(result[i] > max){
        max = result[i];
        index = i;
      }
    }
    
    System.out.println((char)(index + 'A'));
  }
}