package algorithm.baekjoon.s2;
import java.io.*;
public class B2753 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println(((a%4 == 0) && ((a%100!=0) || (a%400==0))) ? 1 : 0);
    }

}
