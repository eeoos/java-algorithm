package algorithm.inflearn.s7;

import java.util.*;
import java.io.*;
  
public class I0706 {
  static int n;
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    DFS(1, new ArrayList<>());
  }
  
  static void DFS(int m, List<Integer> list){
    if(m == n+1){
      if(!list.isEmpty()){
        for(int i = 0; i<list.size(); i++){
          if(i>0) System.out.print(" "+list.get(i));
          else System.out.print(list.get(i));
        }
        System.out.println();
      }
      return;
    }
    list.add(m);
    DFS(m+1, list);
    
    list.remove(list.size()-1);
    DFS(m+1, list);
  }
}