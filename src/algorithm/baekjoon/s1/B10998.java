package algorithm.baekjoon.s1;

import java.util.*;
import java.io.*;

public class B10998 {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println(a*b);
    }

}
