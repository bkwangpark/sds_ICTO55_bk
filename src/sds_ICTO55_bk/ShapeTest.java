package sds_ICTO55_bk;

public class ShapeTest {
	public static void main(String[] args) {
		Rect r=new Rect(10, 15);
		Circle c=new Circle(10);
		Triangle t=new Triangle(10,10);
		
		r.draw(); c.draw(); t.draw();
		
		System.out.println();
		System.out.println(r.caculateArea());
		System.out.println(c.caculateArea());
		System.out.println(t.caculateArea());
		System.out.println();
		
		Point r1=new ColorPoint(3,5,"red");
		r1.draw();
		Point c1=new ColorPoint(7,9,"blue");
		c1.draw();
		Point t1=new ColorPoint(10,18);
		t1.draw();
	}
}
