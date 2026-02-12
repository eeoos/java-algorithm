import java.util.*;
import java.io.*;
  
public class Main {
  public static void main(String[] args) throws IOException {
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int T= Integer.parseInt(st.nextToken());
    int target = Integer.parseInt(st.nextToken());
    
    int[] arr = new int[T];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<T; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr);
	binarySearch(arr, 0, T-1, target);
    
  }
  
  static void binarySearch(int[] arr, int start, int end, int target){
    if(start == end) {
      if(target == arr[start]) System.out.println(start);
      return;
    }
    
    int middle= (start + end) /2;
    if(target == arr[middle]) System.out.println(middle);
    else if(target < arr[middle] && (middle-1) >= start) binarySearch(arr, start, middle-1, target);
    else if(target > arr[middle] && (middle+1) <= end) binarySearch(arr, middle+1, end, target);
  }
}