package algorithm.inflearn.introduction.s1.repeat;

import java.io.*;

public class I0107_2 {
  public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine().toUpperCase();
    int lt = 0, rt = s.length()-1;
    while(lt<rt){
      if(s.charAt(lt) != s.charAt(rt)){
        System.out.println("NO");
        return;
      }
      lt++;
      rt--;
    }
    System.out.println("YES");
    
  }
}
