/*
 * This class's main method instantiates 4 objects for each of the 4 subclasses
 * of Quadrilateral and then outputs their areas.
 */

package us.justg.gus.quadrilateral;

/**
 * Quadrilateral
 * The highest level class in this assignment - describes a 4-sided shape. 
 * 
 * @author hfs5022
 */
public class Quadrilateral {
    
    // The four points which make up this shape.
    final private Point TL;
    final private Point TR;
    final private Point BR;
    final private Point BL;
    
    public static void main(String[] args) {
        
        //Trapezoid coordinate points
        Point trapezoidTL = new Point(2.0, 4.0);
        Point trapezoidTR = new Point(5.0, 4.0);
        Point trapezoidBR = new Point(4.0, 2.0);
        Point trapezoidBL = new Point(3.0, 2.0);
        
        //Parallelogram coordinate points
        Point parallelogramTL = new Point(2.0, 4.0);
        Point parallelogramTR = new Point(5.0, 4.0);
        Point parallelogramBR = new Point(6.0, 2.0);
        Point parallelogramBL = new Point(3.0, 2.0);
        
        //Rectangle coordinate points
        Point rectangleTL = new Point(2.0, 4.0);
        Point rectangleTR = new Point(5.0, 4.0);
        Point rectangleBR = new Point(5.0, 2.0);
        Point rectangleBL = new Point(2.0, 2.0);
        
        //Square coordinate points
        Point squareTL = new Point(2.0, 4.0);
        Point squareTR = new Point(4.0, 4.0);
        Point squareBR = new Point(4.0, 2.0);
        Point squareBL = new Point(2.0, 2.0);
        
        // The shape objects themselves
        Trapezoid tr = new Trapezoid(trapezoidTL,trapezoidTR,trapezoidBR,trapezoidBL);
        Parallelogram pa = new Parallelogram(parallelogramTL,parallelogramTR,parallelogramBR,parallelogramBL);
        Rectangle re = new Rectangle(rectangleTL,rectangleTR,rectangleBR,rectangleBL);
        Square sq = new Square(squareTL,squareTR,squareBR,squareBL);
        
        System.out.printf("Trapezoid area: %f%nParallelogram area: %f%n", tr.calculateArea(), pa.calculateArea());
        System.out.printf("Rectangle area: %f%nSquare area: %f%n", re.calculateArea(), sq.calculateArea());
    }

    public Quadrilateral(Point[] points) {
        this.TL = points[0];
        this.TR = points[1];
        this.BR = points[2];
        this.BL = points[3];
    }
    
    public Quadrilateral(Point pt1, Point pt2, Point pt3, Point pt4){
        this.TL = pt1;
        this.TR = pt2;
        this.BR = pt3;
        this.BL = pt4;
    }
    
    // Returns 0, as we can't calculate the area of something as general as a quadrillateral.
    public double calculateArea(){
        return 0;
    }
    
    public Point getTL() {
        return TL;
    }

    public Point getTR() {
        return TR;
    }

    public Point getBR() {
        return BR;
    }

    public Point getBL() {
        return BL;
    }
    
    // Return an array of points instead of individual points.
    public Point[] getPoints() {
        Point[] points = new Point[4];
        points[0] = this.getTL();
        points[1] = this.getTR();
        points[2] = this.getBR();
        points[3] = this.getBL();
        
        return points;
    }
}
