package algorithm.inflearn.s8;

import java.util.*;
import java.io.*;
  
public class I0801 {
  
  static int[] ch, arr;
  static int n, sum, tmp;  
  static String result = "NO";
  
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    arr = new int[n+1];
    ch = new int[n+1];
    for(int i =1; i<=n; i++) arr[i] = Integer.parseInt(st.nextToken());
    int sum = Arrays.stream(arr).sum();
    
    if(sum%2!=0){
      System.out.println("NO");
      return;
    }
    
    DFS(1);
    System.out.println(result);
  }
  
  static void DFS(int v){
    if(v == arr.length){
 	  for(int i =1; i<=n; i++){
        if(ch[i] ==1) sum+=arr[i];
        else tmp+=arr[i];
      }
      
      if(sum == tmp) result= "YES";
      return;
    }
    
    ch[v] = 1;
    DFS(v+1);
    
    ch[v] = 0;
    DFS(v+1);
  }
}
