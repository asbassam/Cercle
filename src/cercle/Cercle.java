package cercle;

import segment.Point;
import segment.Segment2D;

public class Cercle {
	private Point c; //centre du cercle
	private double r; //rayon du cercle
	
	//constructeur prenant en parametre le centre du cercle et le rayon
	public Cercle(Point c, double r) {
		this.c=c;this.r=r;
	}
	
	//constructeur prenant en parametre le centre du cercle et un point du cercle
	public Cercle(Point c, Point p) {
		Segment2D s=new Segment2D(c, p); //on construit le segment entre le centre du cercle et le point du cercle
		this.c=c;
		r=s.getLongueur(); //on affecte le rayon du cercle par la longueur du segment formee par les deux points
	}
	
	//Le perimetre du cercle
	public double getPerimetre() {
		return 2*Math.PI*r;
	}
	
	//La surface du cercle
	public double getSurface() {
		return Math.PI*r*r;
	}
	
	//verifie si un point p appartient ou non au cercle
	public boolean appartient(Point p) {
		Segment2D s=new Segment2D(c, p);
		if(s.getLongueur()==r) return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "Cercle["+c.toString()+","+r+"]";
	}
	
	public double getR() {
		return r;
	}
}
