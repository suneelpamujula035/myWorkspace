package coderpad;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {

		int numRows = 5; // Number of rows in Pascal's Triangle
        List<List<Integer>> triangle = generatePascalsTriangle(numRows);
        
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
	}

	private static List<List<Integer>> generatePascalsTriangle(int numRows) {

		 List<List<Integer>> triangle = new ArrayList<>();
		 
		 for(int rowNum=0; rowNum<numRows; rowNum++)
		 {
			 List<Integer> row = new ArrayList<>();
			 row.add(1);
			 for(int j=1; j<rowNum; j++)
			 {
				int value = triangle.get(rowNum-1).get(j-1)+triangle.get(rowNum-1).get(j);
				row.add(value);
			 }
			 if(rowNum>0)
			 {
				 row.add(1);
			 }
			 triangle.add(row);
		 }
		 
		return triangle;
	}

}
