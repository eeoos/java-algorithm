package algorithm.inflearn.introduction.s2.repeat;

import java.util.*;
import java.io.*;

public class I0212 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st= new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    
    int[][] arr = new int[m][n];
    for(int i = 0; i<m; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j<n; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    I0212 T = new I0212();
    System.out.println(T.solution(n, m, arr));
    System.out.println(T.solution2(n, m, arr));
    
  }
  public int solution(int n, int m, int[][] arr){
	    int answer = 0;
	    
	    for(int i= 0; i<n; i++){
	      for(int j = 0; j<n; j++){
	        
	        int cnt = 0;
	        for(int k = 0; k<m; k++){
	          int pi = 0;
	          int pj = 0;
	          for(int s = 0; s<n; s++){
	            if(arr[k][s] -1 == i) pi = s;
	            if(arr[k][s] -1 == j) pj = s;
	          }
	          if(pi < pj) cnt++;
	        }
	        if(m == cnt) answer++;
	      }
	    }
	    return answer;
	  }
  
  public int solution2(int n, int m, int[][] arr){
    int[][] rank = new int[m][n];
    for(int i =0; i<m; i++){
      for(int j = 0; j<n; j++){
        int index = arr[i][j] - 1;
        rank[i][index] = j;
      }
    }
    
    int answer = 0;
 	for(int i =0; i<n; i++){
      for(int j = 0; j<n; j++){
    	if(i == j) continue;
        int cnt= 0;
        for(int k = 0; k<m; k++){
          if(rank[k][i] < rank[k][j]) cnt++;
        }
        if(cnt == m) answer++;
      }
    }  
    return answer;
  }
}