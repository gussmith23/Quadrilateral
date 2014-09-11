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
public class Quadrilateral {
    
    private double area;
    private Point[] points;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public Quadrilateral(Point[] points) {
        this.points = points;
    }
    
    public double calculateArea() {
        return area;
    }
    
    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }
    
}
