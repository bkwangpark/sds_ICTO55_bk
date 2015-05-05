package sds_ICTO55_bk;

public class Rect extends Shape implements Drawable{
	private int height;
	private int width;
	
	public Rect(){
		
	}
	public Rect(int height, int width){
		this.height=height;
		this.width=width;
	}
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw(){
		System.out.println("높이가 "+getHeight()+", 너비가 "+getWidth()+"인 사각형을 그렸습니다.");
	}
	
	public void visible(boolean visible){
		if(visible==true){
			draw();
		}else{
			System.out.println("높이가 "+getHeight()+", 너비가 "+getWidth()+"인 사각형을 지웠습니다.");
		}
	}

	@Override
	public double caculateArea() {
		double area=height*width;
		return area;
	}
}
