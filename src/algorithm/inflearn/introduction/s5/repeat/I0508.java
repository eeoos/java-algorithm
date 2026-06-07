package algorithm.inflearn.introduction.s5.repeat;

import java.io.*;
import java.util.*;

public class I0508 {
	static class Doc{
		int idx, p;
		Doc(int idx, int p){
			this.idx = idx;
			this.p = p;
		}
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st=  new StringTokenizer(br.readLine());
		for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		I0508 T = new I0508();
		System.out.println(T.solution(n, m, arr));
	}
	
	public int solution(int n, int m, int[] arr) {
	
		Deque<Doc> dq = new ArrayDeque<>();
		int result = 0;
		
		for(int i = 0; i<n; i++) {
			Doc e = new Doc(i, arr[i]);
			dq.offer(e);
		}
		
		while(!dq.isEmpty()) {
			Doc front = dq.poll();
			boolean hasHigher = false;
			
			for(Doc x : dq) {
				if(front.p < x.p) {
					hasHigher = true;
					break;
				}
			}
			
			if(hasHigher) {
				dq.offer(front);
			}else {
				result++;
				
				if(front.idx == m) {
					return result;
				}
			}
		}
		return result;
	}
}
