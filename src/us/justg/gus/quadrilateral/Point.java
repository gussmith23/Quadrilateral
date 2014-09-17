package us.justg.gus.quadrilateral;

/**
 * Point
 * A simple point object, with an x and y field and various static math funcs.
 * 
 * @author hfs5022
 */
public class Point {
    
    private double x,y; 

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Distance between two points.
    static double calculateDistance(Point pt1, Point pt2){
        
        double x = pt1.x - pt2.x;
        double y = pt1.y - pt2.y;
        
        return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        
    }
    
    static double calculateDistance(Point[] pts){
        
        return calculateDistance(pts[0], pts[1]);
        
    }
    
    // Slope of the line formed by two points.
    static double calculateSlope(Point pt1, Point pt2){
        
        double deltaX = pt1.x - pt2.x;
        double deltaY = pt1.y - pt2.y;
        
        return deltaY/deltaX;
    }
    
    static double calculateSlope(Point[] pts){
        return calculateSlope(pts[0], pts[1]);
    }
    
    // Intercept of the line formed by two points.
    static double calculateIntercept(Point pt1, Point pt2){
        return pt1.y - calculateSlope(pt1, pt2)*pt1.x;
    }
    
    static double calculateIntercept(Point[] pts){
        return calculateIntercept(pts[0], pts[1]);
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
