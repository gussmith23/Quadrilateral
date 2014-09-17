package us.justg.gus.quadrilateral;

/**
 * Square
 * A Rectangle with equal side lengths.
 * 
 * @author hfs5022
 */
public class Square extends Rectangle {
    
    public Square(Point[] points) {
        super(points);
    }
    
    public Square(Point pt1, Point pt2, Point pt3, Point pt4){
        super(pt1,pt2,pt3,pt4);
    }
    
    @Override
    public double calculateArea() {
        
        Point[] pts = this.getPoints();
        
        double a = Point.calculateDistance(pts[0], pts[1]);
        return a*a;
        
    }
}
