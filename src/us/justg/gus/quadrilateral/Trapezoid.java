/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package us.justg.gus.quadrilateral;

/**
 *
 * @author hfs5022
 */
public class Trapezoid extends Quadrilateral {

    public Trapezoid(Point[] points) {
        super(points);
    }
    
    @Override
    public double calculateArea(){
        
        Point[] points = super.getPoints();
        double a, b, h;
        
        // First, we find which sides are parallel. 
        
        // If the seg 0 to 1 and 2 to 3 are parallel...
        if( Point.slope(points[0],points[1]) == Point.slope(points[2],points[3])) {
            
            a = Point.calculateDistance(points[0], points[1]);
            b = Point.calculateDistance(points[2], points[3]);
            
        }
        
        
            
        return 0;
    }
    
    public double findAltitude(){
        
        Point[][] parallelSegments = findParallelSegments();
        
    }
    
    public Point[][] findParallelSegments(){
        
        Point[] points = super.getPoints();
        Point[][] parallelSegments = null;
        
        if( Point.slope(points[0],points[1]) == Point.slope(points[2],points[3])) {
            
            parallelSegments[0][0] = points[0];
            parallelSegments[0][1] = points[1];
            parallelSegments[1][0] = points[3];
            parallelSegments[1][1] = points[2];
                        
        }
        else {
            
            parallelSegments[0][0] = points[0];
            parallelSegments[0][1] = points[3];
            parallelSegments[1][0] = points[1];
            parallelSegments[1][1] = points[2];
        }
        
        return parallelSegments;
    }
    
}
