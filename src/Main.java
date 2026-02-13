import java.util.*;
import java.io.*;
  
public class Main {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st= new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
    
    int sum = 0;
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
      sum += arr[i];
    }
    
    
    int rt= sum;
    int lt = Arrays.stream(arr).max().getAsInt();
    int result = binarySearch(arr, lt, rt, m);
    
    System.out.println(result);
  }
  static int binarySearch(int[] arr, int begin, int end, int m){
    if(begin > end) return begin;
    
    int mid = (begin + end)/ 2;
    if(count(arr, mid) <= m) return binarySearch(arr, begin, mid-1, m);
    else return binarySearch(arr, mid+1, end, m);
  }
  
  static int count(int[] arr, int capacity){
    int cnt = 1, sum = 0;
    for(int a: arr){
      if(sum + a > capacity){
        cnt++;
        sum = a;
      }else sum+=a;
    }
    return cnt;
  }
}