package cercle;

import segment.Point;

public class Application {

	public static void main(String[] args) {
		Cercle c1=new Cercle(new Point(100,100), 50);
		Cercle c2=new Cercle(new Point(130,100), 40);
		
		System.out.println("Le cercle c1 a pour rayon r="+c1.getR()+" et pour périmètre p="+c1.getPerimetre());
		System.out.println("Le cercle c2 a pour rayon r="+c2.getR()+" et pour périmètre p="+c2.getPerimetre());
		
		System.out.println(c1.appartient(new Point(120, 100))==c2.appartient(new Point(120, 100)));

	}

}
