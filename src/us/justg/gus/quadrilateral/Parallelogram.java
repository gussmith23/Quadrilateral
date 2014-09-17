package us.justg.gus.quadrilateral;

/**
 * Parallelogram
 * A quadrilateral with TWO parallel sets of lines. Thus, a Parallelogram is
 * a Trapezoid.
 * 
 * @author hfs5022
 */
public class Parallelogram extends Trapezoid{

    public Parallelogram(Point[] points) {
        super(points);
    }
    
    public Parallelogram(Point pt1, Point pt2, Point pt3, Point pt4){
        super(pt1,pt2,pt3,pt4);
    }
    
    @Override
    public double calculateArea(){
        double b = Point.calculateDistance(this.findParallelSegments()[0]);
        double h = this.findAltitude();
        return b*h;
    }
}
