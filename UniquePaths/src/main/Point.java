package main;

public class Point {
	
	private int mX;
	private int mY;
	private String mPath;
	
	Point(int pX, int pY){
		mX = pX;
		mY = pY;
		mPath="[" + pX + ", " + pY + "]";
	}
	
	Point(int pX, int pY, String pPath){
		mX = pX;
		mY = pY;
		mPath=pPath;
	}
	
	public int getX() {
		return mX;
	}
	public int getY() {
		return mY;
	}
	public String getPath() {
		return mPath;
	}
	public void setPath(String pPath) {
		mPath = pPath;
	}
	
	@Override
	public String toString() {
		return "[" + mX + ", " + mY + "]";
	}
}
