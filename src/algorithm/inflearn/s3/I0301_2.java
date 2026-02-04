package algorithm.inflearn.s3;


import java.util.*;
import java.io.*;
public class I0301_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		StringTokenizer st;
		
		int a = Integer.parseInt(br.readLine());
		int[] aa = new int[a];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<a; i++) {
			aa[i] = Integer.parseInt(st.nextToken());
		}
		
		int b = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] ba = new int[b];
		for(int i = 0; i<b; i++) {
			ba[i] = Integer.parseInt(st.nextToken());
		}
		
		int p1 = 0, p2 = 0;
		while(p1 < a && p2 < b) {
			
			if(!(p1== 0 && p2 == 0)) {
				sb.append(" ");
			}
			
			if(aa[p1] <= ba[p2]) {
				sb.append(aa[p1++]);
			}else {
				sb.append(ba[p2++]);
			}
		}
		
		while(p1 < a) {
			sb.append(" ").append(aa[p1++]);
		}
		
		while(p2 < b) {
			sb.append(" ").append(ba[p2++]);
		}
		System.out.println(sb);
	}
}
