package algorithm.baekjoon.s2;

import java.io.*;

public class B14681 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int result = 0;
        if(a > 0){
            if(b>0){
                result = 1;
            }else {
                 result = 4;   
            }
        }else {
            if( b>0){
                result = 2;
            }else {
                result = 3;
            }
        }
        System.out.println(result);
    }

}
