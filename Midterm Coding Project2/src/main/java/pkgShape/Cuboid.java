package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {

	private int Depth;
	
	public Cuboid(int Width, int Length, int depth) {

		super(Width, Length);
		
		if(Width < 0 || Length < 0 || depth < 0) {
			throw new IllegalArgumentException();
		}
		else {
			this.Depth = depth; 
			
		}

		

	}



	public int getDepth() {

		return Depth;

	}



	public void setDepth(int Depth) {

		this.Depth = Depth;

	}

	public double volume() {

		return super.area()*Depth;

	}

	@Override

	public double area() {

		return 2*(super.area()+super.getLength()*Depth+Depth*super.getWidth());

	}

	@Override 

	public double perimeter() {

		throw new UnsupportedOperationException();

	}

	

	

	public int compareTo(Object cube) {

		Cuboid c = (Cuboid) cube; 

		if(this.area()<c.area())

			return -1;	

		else if (this.area()>c.area())

			return 1; 

		else 

			return 0; 

		

	}

	public static class SortByArea implements Comparator<Cuboid> {

		public SortByArea(){

			super();

		}

		public int compare(Cuboid a, Cuboid b) {

			return a.compareTo(b);		

		}

		 

	}

	public static class SortByVolume implements Comparator<Cuboid> {	

		public SortByVolume(){

			super();

		}

		public int compare(Cuboid a, Cuboid b) {

			if(a.volume()<b.volume())

				return -1;	

			else if (a.volume()>b.volume())

				return 1; 

			else 

				return 0; 

		}

		

	}

		

}