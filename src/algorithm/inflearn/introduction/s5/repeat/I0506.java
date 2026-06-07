package algorithm.inflearn.introduction.s5.repeat;

import java.io.*;
import java.util.*;

public class I0506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		I0506 T = new I0506();
		System.out.println(T.solution(n, k));
	}
	
	public int solution(int n, int k) {
		int cnt = 1;
		Deque<Integer> dq = new ArrayDeque<>();
		for(int i = 1; i<=n; i++) dq.offer(i);
		
		
		while(dq.size() > 1) {
			
			int front = dq.poll();
			System.out.println(front + " " + cnt);
			if(cnt==k) {
				System.out.println(front + "상황발");
				cnt = 1;
			}
			else {
				dq.offer(front);
				cnt++;
				
			}
			System.out.println(front + " " + cnt);
		}
		
		return dq.poll();
	}
}
