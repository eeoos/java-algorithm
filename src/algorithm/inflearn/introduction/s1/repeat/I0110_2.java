package algorithm.inflearn.introduction.s1.repeat;

import java.io.*;
import java.util.*;

public class I0110_2 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
	
    char[] arr = st.nextToken().toCharArray();
    char t = st.nextToken().charAt(0);
    int[] answer = new int[arr.length];
    
    int p = 1000;
    for(int i=0; i<arr.length; i++){
		if(arr[i]==t){
			p=0;
			answer[i]=p;
		}
		else{
			p++;
			answer[i]=p;
		}
	}
	p=1000;
	for(int i=arr.length-1; i>=0; i--){
		if(arr[i]==t) p=0;
		else{
			p++;
			answer[i]=Math.min(answer[i], p);
		}
	}
    for(int i = 0; i<answer.length; i++) {
    	if(i>0) sb.append(" ").append(answer[i]);
    	else sb.append(answer[i]);
    }
    
    System.out.println(sb);
  }
}