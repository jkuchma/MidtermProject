package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.*;

import pkgShape.Cuboid.SortByArea;

import pkgShape.Cuboid.SortByVolume;



public class ShapeTest{

	@Test
	public void RectangleConstructor_Test1(){

		pkgShape.Rectangle rec = new pkgShape.Rectangle(4,5);
		
		assertEquals(rec.getLength(), 4);
		assertEquals(rec.getWidth(), 5);


	}

	@Test(expected = IllegalArgumentException.class)
	public void RetangleConstructor_Test2() {
		pkgShape.Rectangle rec = new pkgShape.Rectangle(-4,-5);
	
	}

	@Test
	public void RectangleArea_Test1() {

		pkgShape.Rectangle r = new pkgShape.Rectangle(4,5);

		assertEquals(r.area(),20.0,0);

	}

	@Test

	public void RectPeri_Test1() {

		pkgShape.Rectangle rec = new pkgShape.Rectangle(4,5);

		assertEquals(rec.perimeter(),18.0,0);	

	}

	@Test

	public void compareTo_Test1() {

		pkgShape.Rectangle a = new pkgShape.Rectangle(4,5);

		pkgShape.Rectangle b = new pkgShape.Rectangle(2,5);

		assertTrue(a.compareTo(b)== 1); 

		assertTrue(b.compareTo(a)== -1); 





	}


	@Test

	public void CuboidConstructor_Test1() {

		pkgShape.Cuboid c = new pkgShape.Cuboid(1,2,3);

		c.setLength(1);

		c.setWidth(2);

		c.setDepth(3);

		assertEquals(c.getLength(), 1);

		assertEquals(c.getWidth(), 2);

		assertEquals(c.getDepth(),3);

	}
	@Test(expected = IllegalArgumentException.class)
	public void CuboidConstructor_Test2() {
		pkgShape.Cuboid c = new pkgShape.Cuboid(-1,-2,-3);
	}

	@Test
	public void CuboidArea_Test1() {

		pkgShape.Cuboid c = new pkgShape.Cuboid(1,2,3);

		assertEquals(c.area(), 22.0, 0);


	}

	@Test(expected = UnsupportedOperationException.class)
	public void CuboidPeri_Test1() {

		pkgShape.Cuboid c = new pkgShape.Cuboid(1,2,3);

		c.perimeter();
	}


	private final SortByArea SortByArea = new SortByArea();

	@Test
	public void SortByArea_Test1(){

		pkgShape.Cuboid a = new pkgShape.Cuboid(5,5,7);

		pkgShape.Cuboid  b = new pkgShape.Cuboid(5,5,4);

		

		int result = SortByArea.compare(a,b);

		assertTrue(result == 1);

	}

	private final SortByVolume SortByVolume = new SortByVolume();

	@Test
	public void SortByVolume_Test1() {

		pkgShape.Cuboid a = new pkgShape.Cuboid(5,5,7);

		pkgShape.Cuboid  b = new pkgShape.Cuboid(5,5,4);	

		int result = SortByVolume.compare(a,b);

		assertTrue(result == 1);
	}

}