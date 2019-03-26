package pkgShape;

public class Cuboid extends Shape{
	int Length, Width, Height;

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

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public Cuboid(int length, int width, int height) {
		
		if (length < 0 || width < 0 || height < 0) {
			throw new IllegalArgumentException("Length, Width, or Height cannot be negative.");
		}
		else {
			this.Length = length;
			this.Width = width;
			this.Height = height;
		}
	}
	
	public double area() {
		return Length * Width * Height;
	}
	public double perimeter() {
		return 4*(Length + Width + Height);
	}
	
	

}
