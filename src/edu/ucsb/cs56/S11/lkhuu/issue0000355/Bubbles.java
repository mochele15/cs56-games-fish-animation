package edu.ucsb.cs56.S11.lkhuu.issue0000355;

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

public class Bubbles
{
    int x, y, diameter;
    Bubbles(int x, int y, int diameter){
	this.x = x;
	this.y = y;
	this.diameter = diameter;
    }
    int getX(){return x;}
    int getY(){return y;}
    int getDiameter(){return diameter;}
    void setX(int x) { this.x = x;}
    void setY(int y) { this.y = y;}
    void move(int m) { y-= m;}
}
	
