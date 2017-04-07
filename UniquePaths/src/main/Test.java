package main;

public class Test {
	public static void main(String[] args) {
		// Hard-coded values to test the program
		///////////////////////////////////////
		int xStart = 0;
		int yStart = 0;
		int xSize = 3;
		int ySize = 3;

		Point startPoint = new Point(xStart, yStart);	//Create the starting point for the robot
		Point gridSize = new Point(xSize, ySize);		//Set the size of the grid
		int nOfSolutions = UniquePaths.solve(startPoint, gridSize, true);

		
		System.out.println("\nThe number of solutions for a X:" + gridSize.getX() +  ",Y:" + gridSize.getY()
							+ " sized grid, starting from " + startPoint.toString() 
							+ " is: " + nOfSolutions);
		
		/////////////////////////////////////
		
		xStart = 0;
		yStart = 1;
		xSize = 3;
		ySize = 3;
		//////////////////////////////////////
		startPoint = new Point(xStart, yStart);	//Create the starting point for the robot
		gridSize = new Point(xSize, ySize);	//Set the limits of the grid
		nOfSolutions = UniquePaths.solve(startPoint, gridSize, true);

		
		System.out.println("\nThe number of solutions for a X:" + gridSize.getX() +  ",Y:" + gridSize.getY()
							+ " sized grid, starting from " + startPoint.toString() 
							+ " is: " + nOfSolutions);
		
	}
}
