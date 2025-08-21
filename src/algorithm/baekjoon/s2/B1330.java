package algorithm.baekjoon.s2;
import java.util.*;
import java.io.*;
public class B1330 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        String result = (a == b) ? "==" : (a>b) ? ">" : "<";
        System.out.println(result);
    }

}
