package algorithm.baekjoon.s2;

import java.io.*;

public class B9498 {
  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int input = Integer.parseInt(br.readLine());
      String result = "";
      if(input >= 90) result = "A";
      else if(input >= 80) result = "B";
      else if(input >= 70) result = "C";
      else if(input >= 60) result = "D";
      else result = "F";
      
      System.out.println(result);
  }
}