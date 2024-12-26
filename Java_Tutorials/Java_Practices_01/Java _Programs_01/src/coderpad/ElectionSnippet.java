package coderpad;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ElectionSnippet {

	public static void main(String[] args) {

		String[] votes = {"Alice", "Bob", "Alice", "Charlie", "Bob", "Alice", "Bob"};
        
        String winner = findWinner(votes);
        System.out.println("The winner is: " + winner);
	}

	private static String findWinner(String[] votes) {
//		return Arrays.stream(votes).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//		.entrySet().stream()
//		.max(Comparator.comparingLong(Map.Entry::getValue))
//		.map(Map.Entry::getKey).orElse(null);
		Map<String, Long> map = Arrays.stream(votes).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Long max = map.values().stream().max(Long::compare).get();
		map.entrySet().stream().filter(entry->entry.getValue()==max).map(Map.Entry::getKey).limit(1).forEach(System.out::println);
		return null;
	}
}
