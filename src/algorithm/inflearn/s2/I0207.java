package algorithm.inflearn.s2;
import java.util.Scanner;

public class I0207 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int T = sc.nextInt();
		sc.nextLine();
		
		boolean answer = false;
		int score = 1;
		int sum = 0;
		
		for(int i = 0; i<T; i++) {
			int input = sc.nextInt();
			
			if(input == 1) {
				sum += score++;
				answer = true;
			}else {
				score = 1;
				answer = false;
			}
		}
		System.out.println(sum);
	}
}
