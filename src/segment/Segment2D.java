package segment;

public class Segment2D {
	private Point p1,p2;
	
	public Segment2D(Point p1, Point p2) {
		this.p1=p1;this.p2=p2;
	}
	
	public double getLongueur() {
		return Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
	}
	
	@Override
	public String toString() {
		return "SEGMENT["+p1.toString()+"|"+p2.toString()+"]";
	}
}
