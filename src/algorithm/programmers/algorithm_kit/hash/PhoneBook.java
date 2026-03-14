package algorithm.programmers.algorithm_kit.hash;

import java.util.*;

public class PhoneBook {
	public static void main(String[] args) {
		PhoneBook T = new PhoneBook();
		System.out.println(T.solution(new String[] {"119", "97674223", "1195524421"}));
		System.out.println(T.solution(new String[] {"123","456","789"}));
		System.out.println(T.solution(new String[] {"12","123","1235","567","88"}));
	}
	public boolean solution(String[] phone_book) {
        
        Arrays.sort(phone_book);
        for(int i = 0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])) return false;
        }
        return true;
    }
}
