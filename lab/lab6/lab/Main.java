package lab;

public class Main {
	public static void main(String[] args) {
		Point p = new Point(3,5);
		
		System.out.println("x= " + p.xCoord + " y = " + p.yCoord);
		
		Point p2 = new Point (6,6);
		p2.yCoord =7;
		Rectangle r = new Rectangle(6, 8,p2);
		
		r.topLeft = p;
		
		
	    System.out.println(r.area());
	    
	    Rectangle r2 = new Rectangle(10,12,p2);
	    
	    System.out.println(r2.area());
	    
	    System.out.println(r2.perimeter());
	    
	    Point[] corners = r2.corners();
	    for (int i = 0; i< corners.length; i++) {

			System.out.println("x= " + 	corners[i].xCoord+ " y = " + corners[i].yCoord);
			
	    }
	    Circle c = new Circle(8, new Point(5,5));
	    Circle c2 = new Circle(9, new Point(10,15));
	    
	    System.out.println(c.area());
	    System.out.println(c.perimeter());
	    System.out.println(c.overlap(c2));
	    
	}

}
