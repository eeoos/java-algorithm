package algorithm.inflearn.introduction.s1.repeat2;

import java.io.*;

public class I0104 {
	public static void main(String[] args) throws IOException {
		I0104 T = new I0104();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i<n; i++) {
			String s = br.readLine();
//			System.out.println(T.solution(s));
			System.out.println(T.solution2(s));
		}
	}
	
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		return sb.append(s).reverse().toString();
	}
	
	public String solution2(String s) {
		int lt = 0;
		int rt = s.length() -1;
		char[] arr = s.toCharArray();
		while(lt < rt) {
			char tmp = arr[lt];
			arr[lt] = arr[rt];
			arr[rt] = tmp;
			 
			lt++;
			rt--;
		}
		
		return String.valueOf(arr);
	}
}
