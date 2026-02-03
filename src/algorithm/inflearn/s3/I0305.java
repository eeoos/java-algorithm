package algorithm.inflearn.s3;
import java.io.*;
  
public class I0305 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
    int T = Integer.parseInt(br.readLine());
    
    int cnt = 0;
    for(int i = 1; i< T;i++){
      int sum = 0;
      for(int j = i; j<T; j++){
        sum += j;
        if(sum == T) {
          cnt++;
          break;
        }else if(sum > T){
          break;
        }
      }
    }
    
    System.out.println(cnt);
  }
}