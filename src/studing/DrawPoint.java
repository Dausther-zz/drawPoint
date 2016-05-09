package studing;

public class DrawPoint {

	public static void main(String[] args) {
		Point lowerLeft = new Point();
		Point upperRight = new Point();
		Point middlePoint = new Point();
		lowerLeft.x = 0.0;
		lowerLeft.y = 0.0;
		upperRight.x = 1280.0;
		upperRight.y = 1024.0;
		middlePoint.x = 640.0;
		middlePoint.y = 612.0;

		double d = lowerLeft.distance(upperRight);
		System.out.println("lowerLeft.x = " + lowerLeft.x);
		System.out.println("lowerLeft.y = " + lowerLeft.y);
		System.out.println("upperRight.x = " + upperRight.x);
		System.out.println("upperRight.y = " + upperRight.y);
		System.out.println("A distãncia entre lowerLeft e upperRight = " + d);
	}


}
