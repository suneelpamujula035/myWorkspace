package coderpad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {

			String[] words = {"listen", "silent", "enlist", "hello", "world", "drowl"};
	        Map<String, List<String>> groupedAnagrams = groupAnagrams(words);
	        
	        for (Map.Entry<String, List<String>> entry : groupedAnagrams.entrySet()) {
	            System.out.println(entry.getValue());
	        }
		}
		public static Map<String, List<String>> groupAnagrams(String[] words) {
	        Map<String, List<String>> anagramMap = new HashMap<>();
	        
	        for (String word : words) {
	            char[] charArray = word.toCharArray();
	            Arrays.sort(charArray);
	            String key = new String(charArray);
	            
	            anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
	        }
	        
	        return anagramMap;
	}
}
