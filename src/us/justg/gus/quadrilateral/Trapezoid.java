package us.justg.gus.quadrilateral;

/**
 * Trapezoid
 * A quadrilateral  with AT LEAST ONE set of parallel lines.
 * 
 * @author hfs5022
 */
public class Trapezoid extends Quadrilateral {

    public Trapezoid(Point[] points) {
        super(points);
    }

    public Trapezoid(Point trapezoidTL, Point trapezoidTR, Point trapezoidBR, Point trapezoidBL) {
        super(trapezoidTL, trapezoidTR, trapezoidBR, trapezoidBL);
    }
    
    
    @Override
    public double calculateArea(){
        
        Point[] points = super.getPoints();
        double a, b, h;
        
        Point[][] parallelSegments = this.findParallelSegments();
        a = Point.calculateDistance(parallelSegments[0]);
        b = Point.calculateDistance(parallelSegments[1]);
        h = findAltitude();
                    
        return h*(a+b)/2;
    }
    
    // Finding the altitude of parallel lines - i.e. the closest distance between them.
    public double findAltitude(){
        
        Point[][] parallelSegments = findParallelSegments();
        
        double m = Point.calculateSlope(parallelSegments[0]);
        double b1 = Point.calculateIntercept(parallelSegments[0]);
        double b2 = Point.calculateIntercept(parallelSegments[1]);
        
        // The two terms in the altitude calculation eqn.
        double t1 = (b1*m-b2*m)/(m*m+1);
        double t2 = (b2-b1)/(m*m+1);
        
        return Math.sqrt( Math.pow(t1, 2) + Math.pow(t2, 2) );
       
    }
    
    // As this is function is for trapezoids, we assume there's only a single
    // set of parallel segments. This function returns those segments.
    public Point[][] findParallelSegments(){
        
        Point[] points = super.getPoints();
        Point[][] parallelSegments = new Point[2][2];
        
        // If the first set is parallel, return them...
        if( Point.calculateSlope(points[0],points[1]) == Point.calculateSlope(points[2],points[3])) {
            
            parallelSegments[0][0] = points[0];
            parallelSegments[0][1] = points[1];
            parallelSegments[1][0] = points[3];
            parallelSegments[1][1] = points[2];
                        
        }
        
        // Else, the other set must be parallel.
        // Note - we're ASSUMING this trapezoid is actually a trapezoid!
        else {
            
            parallelSegments[0][0] = points[0];
            parallelSegments[0][1] = points[3];
            parallelSegments[1][0] = points[1];
            parallelSegments[1][1] = points[2];
        }
        
        return parallelSegments;
    }
    
}
