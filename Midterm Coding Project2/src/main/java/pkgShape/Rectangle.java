package pkgShape;

public class Rectangle extends Shape{
	
	private int Length;
	private int Width;
	
	public Rectangle(int length, int width) {
		
		if (length < 0 || width < 0) {
			throw new IllegalArgumentException();
		}
		else
		{
			this.Length = length;
			this.Width = width;
		}
	}
	
	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}



	public int getWidth() {
		return Width;
	}



	public void setWidth(int width) {
		Width = width;
	}

	public double area() {
		
		return Length * Width;
	}
	public double perimeter() {
		return (2*Width) +  (2*Length);
	}
	
	public int compareTo(Object rec) {

		Rectangle r = (Rectangle) rec; 

		if(this.area()<r.area())

			return -1;	

		else if (this.area()>r.area())

			return 1; 

		else 

			return 0; 

		 

	}
	
}
