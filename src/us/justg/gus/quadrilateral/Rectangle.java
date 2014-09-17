package us.justg.gus.quadrilateral;

/**
 * Rectangle
 * A quadrilateral with four right angles. A Rectangle is a Parallelogram.
 * 
 * @author hfs5022
 */
public class Rectangle extends Parallelogram {
    
    public Rectangle(Point[] points) {
        super(points);
    }
    
    public Rectangle(Point pt1, Point pt2, Point pt3, Point pt4){
        super(pt1,pt2,pt3,pt4);
    }
    
    @Override
    public double calculateArea() {
        
        Point[][] parallelSegments = this.findParallelSegments();
        double a = Point.calculateDistance(parallelSegments[0]);
        double b = Point.calculateDistance(parallelSegments[0][0], parallelSegments[1][0]);
        
        return a*b;
        
    }
}
