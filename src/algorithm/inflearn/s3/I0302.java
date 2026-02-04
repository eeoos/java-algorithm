package algorithm.inflearn.s3;

import java.util.*;
import java.io.*;
  
public class I0302 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    
    int n = Integer.parseInt(br.readLine());
    int[] a = StringToArr(n, br.readLine());

	int m = Integer.parseInt(br.readLine());
    int[] b = StringToArr(m, br.readLine());
	
    int p1= 0, p2=0;
    int i = 0;
    while(p1 < n && p2 < m){
      
      
      if(a[p1]<b[p2]) p1++;
      else if(a[p1]>b[p2]) p2++;
      else{
        if(i>0) sb.append(" "); 
        sb.append(a[p1]);
        p1++;
        p2++;
        i++;
      }
      
    }
    
    System.out.println(sb);
  }
  
  static int[] StringToArr(int l, String input){
    StringTokenizer st = new StringTokenizer(input);
    int[] arr = new int[l];
    for(int i = 0; i<l; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);
    return arr;
  }
}
