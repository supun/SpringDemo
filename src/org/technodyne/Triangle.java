package org.technodyne;

public class Triangle {

	private Point pointA;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	private Point pointB;
	private Point pointC;

	// private List<Point> points;

	/*
	 * private Point pointA; private Point pointB; private Point pointC;
	 */

	/*
	 * public List<Point> getPoints() { return points; }
	 * 
	 * public void setPoints(List<Point> points) { this.points = points; }
	 */
	/*
	 * public Point getPointA() { return pointA; }
	 * 
	 * public void setPointA(Point pointA) { this.pointA = pointA; }
	 * 
	 * public Point getPointB() { return pointB; }
	 * 
	 * public void setPointB(Point pointB) { this.pointB = pointB; }
	 * 
	 * public Point getPointC() { return pointC; }
	 * 
	 * public void setPointC(Point pointC) { this.pointC = pointC; }
	 */
	/*
	 * private String type; private int height;
	 * 
	 * public int getHeight() { return height; }
	 * 
	 * public void setHeight(int height) { this.height = height; }
	 * 
	 * public Triangle(String type) { this.type = type; }
	 * 
	 * public Triangle(String type, int height) { this.type = type; this.height
	 * = height; }
	 * 
	 * public Triangle(int height) { this.height = height; }
	 * 
	 * public String getType() { return type; }
	 * 
	 * // public void setType(String type) { // this.type = type; // }
	 */
	public void draw() {
		// System.out.println(getType() + " Triangle Drawn height " +
		// getHeight());

		System.out.println("Point A = " + getPointA().getX() + " "
				+ getPointA().getY());
		System.out.println("Point B = " + getPointB().getX() + " "
				+ getPointB().getY());
		System.out.println("Point C = " + getPointC().getX() + " "
				+ getPointC().getY());

		/*
		 * // for (Point point : points) { System.out.println("Point X " +
		 * point.getX() + "Point Y " + point.getY()); // }
		 */

	}
}
