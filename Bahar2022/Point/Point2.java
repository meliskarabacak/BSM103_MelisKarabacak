package Point;

public class Point2 {

	int x ;
	int y;
	
	public double distanceFromOrijin() {
		return Math.sqrt(x*x + y*y);
	}
	public void translate (int dx, int dy) {
		x += dx;
		y += dy;
	}
}
