package com.stackroute.spring;

import java.util.List;

public class Springdemo1 {
	
//	private Point pointA;
//	private Point pointB;
//	private Point pointc;
//	
//	
//public Point getPointA() {
//		return pointA;
//	}
//
//
//	public void setPointA(Point pointA) {
//		this.pointA = pointA;
//	}
//
//
//	public Point getPointB() {
//		return pointB;
//	}
//
//
//	public void setPointB(Point pointB) {
//		this.pointB = pointB;
//	}
//
//
//	public Point getPointc() {
//		return pointc;
//	}
//
//
//	public void setPointc(Point pointc) {
//		this.pointc = pointc;
//	}
//
// using List
private List<Point>points;

public List<Point> getPoints() {
	return points;
}

public void setPoints(List<Point> points) {
	this.points = points;
}

public void draw() {
//	System.out.println("Point A=("+getPointA().getX()+","+getPointA().getY()+")");
//	System.out.println("Point B=("+getPointB().getX()+","+getPointB().getY()+")");
//	System.out.println("Point C=("+getPointc().getX()+","+getPointc().getY()+")");

// for list
	for(Point point:points) {
		System.out.println("Point A=("+point.getX()+","+point.getY()+")");
	}
}


}
