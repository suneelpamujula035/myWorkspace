package coderpad;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CircularList {

	public static void main(String[] args) {

		List<Integer> circularList = Arrays.asList(10, 20, 30, 40);

        List<Integer> result = simulateCircularIteration(circularList, 11);

        System.out.println("Circular List Simulation: " + result);
	}

	private static List<Integer> simulateCircularIteration(List<Integer> circularList, int numIterations) {
		return Stream.generate(()->circularList).flatMap(List::stream).limit(numIterations).collect(Collectors.toList());
	}

}
