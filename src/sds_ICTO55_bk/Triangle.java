package sds_ICTO55_bk;

public class Triangle extends Shape implements Drawable{
	private int height;
	private int width;
	public Triangle(){
		
	}
	public Triangle(int height, int width){
		this.height=height;
		this.width=width;
	}
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void draw(){
		System.out.println("높이가 "+getHeight()+" 밑변이 "+getWidth()+"인 삼각형을 그렸습니다.");
	}

	public void visible(boolean visible){
		if(visible==true){
			draw();
		}else{
			System.out.println("높이가 "+getHeight()+" 밑변이 "+getWidth()+"인 삼각형을 지웠습니다.");
		}
	}

	@Override
	public double caculateArea() {
		return (height*width)/2;
	}
}
