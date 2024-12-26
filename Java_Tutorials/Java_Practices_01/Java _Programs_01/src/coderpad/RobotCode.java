package coderpad;

public class RobotCode {

	public static void main(String[] args) {

		String[] moves = {"Right", "Up", "Up", "Left", "Down", "Right"};
        int[] finalCoordinates = findCoordinates(moves);

        System.out.println("Final Coordinates: (" + finalCoordinates[0] + ", " + finalCoordinates[1] + ")");
	}

	private static int[] findCoordinates(String[] moves) {

		int x=0; int y=0;
		for(String move : moves)
		{
			switch(move)
			{
			case "Right":x++; break;
			case "Left":x--; break;
			case "Up":y++; break;
			case "Down":y--; break;
			default : throw new IllegalArgumentException("Invalid move: " + move);
			}
		}
		return new int[] {x,y};
	}

}
