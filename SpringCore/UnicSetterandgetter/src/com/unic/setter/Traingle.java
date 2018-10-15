package com.unic.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Traingle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	
	@Autowired
	@Qualifier("point")
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	//use this commented code for constructor injection
	/*public Traingle(Point pointA,Point pointB,Point pointC) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	} */
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
	
	public void draw() {
		System.out.println("The pointA co-ordinates are "+this.getPointA().getX()+"  "+this.getPointA().getY());
		System.out.println("The pointB co-ordinates are "+this.getPointB().getX()+"  "+this.getPointB().getY());
		System.out.println("The pointC co-ordinates are "+this.getPointC().getX()+"  "+this.getPointC().getY());
	}
	

}
