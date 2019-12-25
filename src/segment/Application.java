package segment;

public class Application {

	public static void main(String[] args) {
		Point p1=new Point(10, 20);
		Point p2=new Point(50, 60);
		Segment2D s=new Segment2D(p1, p2);
		System.out.println(s.toString());
		System.out.println(s.getLongueur());
	}

}
