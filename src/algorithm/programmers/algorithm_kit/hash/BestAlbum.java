package algorithm.programmers.algorithm_kit.hash;

import java.util.*;

public class BestAlbum {

	public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Map<Integer, Integer>> music = new HashMap<>(); // Map<장르, Map<번호, 재생수>>
        Map<String, Integer> play = new HashMap<>(); // Map<장르, 총재생수>
        
        for(int i = 0; i<genres.length; i++){
            play.put(genres[i], play.getOrDefault(genres[i], 0) + plays[i]);
            
            Map<Integer, Integer> inner = music.getOrDefault(genres[i], new HashMap<>());
            inner.put(i, plays[i]);
            music.put(genres[i], inner);
        }
        
        List<String> order = new ArrayList<>(play.keySet());
        order.sort((o1, o2) -> play.get(o2) - play.get(o1));
        
        for(String s : order){
            List<Integer> list = new ArrayList<>(music.get(s).keySet());
            list.sort((l1, l2) -> music.get(s).get(l2) - music.get(s).get(l1));
            
            answer.add(list.get(0));
            if(list.size() > 1) answer.add(list.get(1));
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
	
	public static void main(String[] args) {
		BestAlbum T = new BestAlbum();
		System.out.println(Arrays.toString(T.solution(new String[] {"classic", "pop", "classic", "classic", "pop"}, new int[] {500, 600, 150, 800, 2500})));
	}
}
