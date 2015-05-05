package sds_ICTO55_bk;

public class Circle extends Shape implements Drawable{
	private int radius;
	public Circle(){
		
	}
	public Circle(int radius){
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw(){
		System.out.println("반지름이 "+getRadius()+" 인 원을 그렸습니다.");
	}
	
	public void visible(boolean visible){
		if(visible==true){
			draw();
		}else{
			System.out.println("반지름이 "+getRadius()+" 인 원을 지웠습니다.");
		}
	}
	
	@Override
	public double caculateArea() {
		double area=radius*radius*Math.PI;
		return area;
	}
}
