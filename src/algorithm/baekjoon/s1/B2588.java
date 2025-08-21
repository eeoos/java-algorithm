package algorithm.baekjoon.s1;
import java.io.*;

public class B2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int tmp = b;
        while(tmp > 0){
        	int c= tmp % 10;
            System.out.println(c * a);
            tmp/=10;
        }
        System.out.println(a * b);
    }
}