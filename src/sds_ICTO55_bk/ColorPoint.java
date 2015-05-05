package sds_ICTO55_bk;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint(){
		
	}
	public ColorPoint(int x, int y, String color)
	{
		super(x,y);
		this.color = color;
	}
	
	public ColorPoint(int x, int y)
	{
		super(x,y);
		this.color = "white";
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void draw(){
		System.out.println("좌표[x="+getX()+",y="+getY()+"]에 "+color+" 도형을 그렸습니다.");
	}
	public void visible(boolean visible){
		if(visible==true){
			draw();
		}
		else{
			System.out.println("좌표[x="+getX()+",y="+getY()+"]에 "+color+" 도형을 지웠습니다.");
		}
	}
}
