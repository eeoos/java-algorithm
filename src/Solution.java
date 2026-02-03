import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        
        
        int index = 1;
        while(true){
            int tmp = index;
            
            int sum = tmp;
            while(tmp > 0) {
            	int mod = tmp % 10;
            	sum += mod;
            	tmp /= 10;
            }
            
            if(sum == T) {
            	System.out.println(index);
            	break;
            }
            index++;
        }
    }
}