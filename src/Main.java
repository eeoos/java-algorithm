import java.util.*;
import java.io.*;
  
public class Main {
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    int T = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    
    int[] arr = new int[T];
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++){
      int in = Integer.parseInt(st.nextToken());
      int pos = -1;
      for(int j = 0; j<T; j++)
        if(arr[j] == in)  pos= j;
      
      int j = T-1;
      if(pos==-1){
        while(j>0){
          arr[j] = arr[j-1];
          j--;
        }
        arr[j] = in;
      }else{
        j = pos;
        while(j>0){
          arr[j] = arr[j-1];
          j--;
        }
        arr[j] = in;
      }
      
    }
    
    for(int i = 0; i<T; i++){
      if(i>0) sb.append(" ");
      sb.append(arr[i]);
    }
    
    System.out.println(sb);
    
  }   
}