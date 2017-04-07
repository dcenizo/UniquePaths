package main;

public class Test {
	public static void main(String[] args) {
		// Hard-coded values to test the program
		///////////////////////////////////////
		int xBound = 3;
		int yBound = 3;
		//////////////////////////////////////
		Point startPoint = new Point(0, 0);						//Create the starting point for the robot
		Point gridLimit = new Point(xBound, yBound);			//Set the limits of the grid
		int nOfSolutions = UniquePaths.solve(startPoint, gridLimit, true);
		
		
		
		System.out.println("\nThe number of solutions for a " + gridLimit.toString() 
							+ " grid, starting from " + startPoint.toString() 
							+ " is: " + nOfSolutions);
	}
}
