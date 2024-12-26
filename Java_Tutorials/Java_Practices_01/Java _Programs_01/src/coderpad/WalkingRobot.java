package coderpad;

public class WalkingRobot {

	public static void main(String[] args) {

		String path = "UUDDLRLRUD";
        int[] finalCoordinates = findFinalCoordinates(path);
        System.out.println("Final Coordinates: (" + finalCoordinates[0] + ", " + finalCoordinates[1] + ")");
	}

	private static int[] findFinalCoordinates(String path) {
		int x=0; int y=0;
		for(char move:path.toCharArray())
		{
			switch(move)
			{
			case 'R':x++;break;
			case 'L':x--;break;
			case 'U':y++;break;
			case 'D':y--;break;
			default:throw new IllegalArgumentException("Invalid move: " + move);
			}
		}
		return new int[] {x,y};
	}

}
