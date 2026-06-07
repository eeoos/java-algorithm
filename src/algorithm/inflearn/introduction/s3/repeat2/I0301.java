package algorithm.inflearn.introduction.s3.repeat2;

import java.io.*;
import java.util.*;

public class I0301 {
	public static void main(String[] args) throws IOException {
		
		I0301 T = new I0301();
		
		StringTokenizer st;
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arrn = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<n; i++) arrn[i] = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		int[] arrm = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<m; i++) arrm[i] = Integer.parseInt(st.nextToken());
		
		System.out.println(T.solution(n, arrn, m, arrm));
		
	}
	
	public String solution(int n, int[] arrn, int m, int[] arrm) {
		
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		
		int p1=0, p2=0;
		while(p1 <n && p2 < m) {
			if(arrn[p1] > arrm[p2]) list.add(arrm[p2++]);
			else list.add(arrn[p1++]);
		}
		
		while(p1<n) list.add(arrn[p1++]);
		while(p2<m) list.add(arrm[p2++]);
		
		for(int i = 0; i<list.size(); i++) {
			if(i>0) sb.append(" ");
			sb.append(list.get(i));
		}
		
		return sb.toString();
	}
}
