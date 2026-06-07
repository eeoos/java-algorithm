package algorithm.inflearn.introduction.s3.repeat2;

import java.io.*;
import java.util.*;

public class I0302 {
	public static void main(String[] args) throws IOException {
		
		I0302 T = new I0302();
		
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] an = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i =0 ; i<n; i++) an[i] = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		int[] am  = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i =0 ; i<m; i++) am[i] = Integer.parseInt(st.nextToken());
		
		System.out.println(T.solution(n, an, m, am));
	}
	
	public String solution(int n, int[] an, int m, int[] am) {
		
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		
		int p1=0,p2=0;
		
		Arrays.sort(an);
		Arrays.sort(am);
		
		while(p1 < n && p2 < m) {
			if(an[p1] < am[p2]) p1++;
			else if(an[p1] > am[p2]) p2++;
			else {
				list.add(an[p1]);
				p1++;
				p2++;
			}
		}
		
		for(int i = 0; i<list.size(); i++) {
			if(i>0) sb.append(" ");
			sb.append(list.get(i));
		}
		
		return sb.toString();
	}
}
