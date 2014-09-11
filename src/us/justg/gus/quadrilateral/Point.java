package us.justg.gus.quadrilateral;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hfs5022
 */
public class Point {
    
    private double x,y; 

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    static double calculateDistance(Point pt1, Point pt2){
        
        double x = pt1.x - pt2.x;
        double y = pt1.y - pt2.y;
        
        return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        
    }
        
    static double slope(Point pt1, Point pt2){
        
        double deltaX = pt1.x - pt2.x;
        double deltaY = pt1.y - pt2.y;
        
        return deltaY/deltaX;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
}
