package coderpad;

public class OptimalValue2DArray {

	public static void main(String[] args) {

		int[][] array = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int maxValue = findOptimalValue(array);
	        System.out.println("Maximum Value: " + maxValue);
	}

	private static int findOptimalValue(int[][] array) {
		int maxValue = Integer.MIN_VALUE;
		for(int row[] : array)
		{
			for(int value : row)
			{
				if(value>maxValue)
				{
					maxValue=value;
				}
			}
		}
		return maxValue;
	}

}
