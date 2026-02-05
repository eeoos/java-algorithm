import java.util.*;
import java.io.*;
  
public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    
    int[] arr = new int[n];
    Set<Integer> set = new HashSet<>();
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
      if(i < k) set.add(arr[i]);
    }
    sb.append(set.size());
    System.out.println(set);
    int lt = 0;
    for(int rt = k; rt<n; rt++){
      
      set.remove(arr[lt++]);
      set.add(arr[rt]);
      sb.append(" ").append(set.size());
      System.out.println(set);
    }
    
    System.out.println(sb);
  }
}