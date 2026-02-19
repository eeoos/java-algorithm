package algorithm.inflearn.s7;

import java.io.*;

public class I0706_2 {
	static int n;
	static int[] ch;
	
	public static void main(String[] args)  throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		ch = new int[n+1];
		DFS(1);
	}
	
	static void DFS(int m) {
		if(m == n+1) {
			String tmp = "";
			for(int i = 1; i<=n; i++) {
				if(ch[i] == 1) tmp += (i + " ");
			}
			if(tmp.length() > 0) System.out.println(tmp);
			return;
		}
		
		ch[m] = 1;
		DFS(m+1);
		
		ch[m] = 0;
		DFS(m+1);
	}
}
