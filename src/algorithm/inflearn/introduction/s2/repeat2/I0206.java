package algorithm.inflearn.introduction.s2.repeat2;

import java.io.*;
import java.util.*;

public class I0206 {
	public static void main(String[] args) throws IOException {
		I0206 T = new I0206();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i= 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		System.out.println(T.solution(n, arr));
		
	}
	
	public String solution(int n, int[] arr) {
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		for(int a : arr) {
			int rvs = reverse(a);
			if(rvs == 1) continue;
			if(isPrime(rvs)) list.add(rvs);
		}
		
		for(int i = 0; i<list.size(); i++) {
			if(i>0) sb.append(" ");
			sb.append(list.get(i));
		}
		
		return sb.toString();
	}
	
	public int reverse(int a) {
		
		int result = 0;
		while(a > 0) {
			int tmp = a%10;
			result = result * 10 + tmp;
			a/=10;
		}
		return result;
	}
	
	public boolean isPrime(int a) {
		for(int i = 2; i<a; i++) {
			if(a%i == 0) return false;
		}
		return true;
	}
}
