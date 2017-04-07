package main;

import java.util.ArrayList;

public final class UniquePaths {
	/*
	Solve this problem using any programming language: 
		A robot is located at the top-left corner of a m x n grid. 
		It can only move either down or right at any point in time. 
		The robot is trying to reach the bottom-right corner of the grid. 
		How many possible unique paths are there? Send us the code your wrote to solve this problem.
	*/
	private static Point mFinalPoint;
	private static ArrayList<String> Solutions = new ArrayList<>();
	
	private UniquePaths(){}

	/**
	 * Calculates the number of possible ways to go form the
	 * starting point to the final point moving only down and to the right.
	 * <br>
	 * @param startingPoint ,object of type Point indicating the starting position
	 * 		can be 0,0 or other valid point of the grid (Starting from 0)
	 * @param pGridSize ,object of type Point that indicates the SIZE OF THE GRID (Starting from one)
	 * @param pShowSolutions, Prints the possible paths if marked as true
	 * @return, a integer representing the number of possible paths
	 */
	static int solve(Point startingPoint, Point pGridSize, boolean pShowSolutions){
		if (startingPoint.getX() >= 0 
				&& startingPoint.getX() < pGridSize.getX()
				&& startingPoint.getY() >= 0
				&& startingPoint.getY() < pGridSize.getY()) {
			
			mFinalPoint = new Point(pGridSize.getX()-1, pGridSize.getY()-1);
			
			ArrayList<Point> pointList = new ArrayList<Point>();
			pointList.add(startingPoint);
			
			findNextMoves(pointList);
			
			if (pShowSolutions) {
				System.out.println("\n");
				for (String s : Solutions) {
					System.out.println(s);
				}
			}
			int nOfSolutions = Solutions.size();
			Solutions = new ArrayList<>();
			mFinalPoint = null;
			
			return nOfSolutions;
			
		}else{
			throw new IllegalArgumentException("The starting point coordinates must be between [0,0] and [" + pGridSize.getX() + "," + pGridSize.getY() +"]");
		}
	}
	
	
	/***
	 * Recursive function that calculates the next possible move of a point.
	 * When it reaches the final point, adds the path used to get there to
	 * an internal ArrayList.
	 * <br>
	 * @param pPoints ,object of type Point indicating the starting position 
	 */
	private static void findNextMoves(ArrayList<Point> pPoints){

		if (pPoints.size() == 1 
				&& pPoints.get(0).getX() == mFinalPoint.getX() 
				&& pPoints.get(0).getY() == mFinalPoint.getY()) {
			Solutions.add(pPoints.get(0).getPath());
		}else{
			for (Point p : pPoints) {
				ArrayList<Point> nextPoints = new ArrayList<Point>();
				if (p.getX()<mFinalPoint.getY()) {
					nextPoints.add(new Point(p.getX()+1, 
							p.getY(),
							p.getPath() + ", " + "[" + (p.getX()+1) + ", " + p.getY() + "]"));
				}
				if (p.getY() < mFinalPoint.getY()) {
					nextPoints.add(new Point(p.getX(), 
							p.getY()+1,
							p.getPath() + ", " + "[" + p.getX() + ", " + (p.getY()+1) + "]"));
				}
				
				findNextMoves(nextPoints);
			}
		}
	}
}
